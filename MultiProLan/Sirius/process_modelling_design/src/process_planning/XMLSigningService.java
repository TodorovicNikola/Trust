package process_planning;

import utils.SecurityUtils;
import utils.XMLUtils;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver;
import org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Constants;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class XMLSigningService {

    private final String privateKeyOrg1Usr1 = "..\\trust-dlt\\hlf-explorer\\examples\\net1\\organizations\\peerOrganizations\\org1.example.com\\users\\User1@org1.example.com\\tls\\client.key";
    private final String certificateOrg1Usr1 = "..\\trust-dlt\\hlf-explorer\\examples\\net1\\organizations\\peerOrganizations\\org1.example.com\\users\\User1@org1.example.com\\tls\\client.crt";

    static {
        Security.addProvider(new BouncyCastleProvider());
        org.apache.xml.security.Init.init();
    }

    /**
     * Signs given document, extracts signature to a new doc
     * and returns the document with the signature.
     * @param documentXML string of an XML document to be signed
     * @return string of an XML document containing only a signature
     */
    public String signDocument(String documentXML) {
        Document doc = XMLUtils.getDocumentFromXML(documentXML);

        PrivateKey key = readPrivateKey();
        Certificate certificate = readCertificate();

        Element signature = signDocument(doc, key, certificate);
        Document documentWithSignature;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            documentWithSignature = builder.newDocument();
            documentWithSignature.adoptNode(signature);
            documentWithSignature.appendChild(signature);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        return XMLUtils.getXMLFromDocument(documentWithSignature);
    }

    private Element signDocument(Document doc, PrivateKey key, Certificate certificate) {
        try {
            XMLSignature sig = new XMLSignature(doc, null, XMLSignature.ALGO_ID_SIGNATURE_ECDSA_SHA512);

            Transforms transforms = new Transforms(doc);

            //iz potpisa uklanja Signature element
            //Ovo je potrebno za enveloped tip po specifikaciji
            transforms.addTransform(Transforms.TRANSFORM_ENVELOPED_SIGNATURE);

            //normalizacija
            transforms.addTransform(Transforms.TRANSFORM_C14N_WITH_COMMENTS);

            //potpisuje se citav dokument (URI "")
            sig.addDocument("", transforms, Constants.ALGO_ID_DIGEST_SHA1);

            //U KeyInfo se postavalja Javni kljuc samostalno i citav sertifikat
            sig.addKeyInfo(certificate.getPublicKey());
            sig.addKeyInfo((X509Certificate) certificate);

            Element rootEl = doc.getDocumentElement();
            rootEl.appendChild(sig.getElement());

            sig.sign(key);

            return sig.getElement();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public Document combineDocumentAndSignature(Document document, Document signatureDocument) {
        Element signature = signatureDocument.getDocumentElement();
        Element documentElement = document.getDocumentElement();
        document.adoptNode(signature);
        documentElement.appendChild(signature);

        return document;
    }

   public boolean verifySignature(Document signatureDoc) {
       try {
           NodeList signatures = signatureDoc.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
           Element signatureEl = (Element) signatures.item(0);

           XMLSignature signature = new XMLSignature(signatureEl, null);

           KeyInfo keyInfo = signature.getKeyInfo();

           if (keyInfo == null) {
               return false;
           }

           //registruju se resolver-i za javni kljuc i sertifikat
           keyInfo.registerInternalKeyResolver(new RSAKeyValueResolver());
           keyInfo.registerInternalKeyResolver(new X509CertificateResolver());

           if (!keyInfo.containsX509Data() || !keyInfo.itemX509Data(0).containsCertificate()) {
               return false;
           }

           Certificate cert = keyInfo.itemX509Data(0).itemCertificate(0).getX509Certificate();

           if (cert == null) {
               return false;
           }

           return signature.checkSignatureValue((X509Certificate) cert);

       } catch (Exception e) {
           e.printStackTrace();
           return false;
       }
   }

    private PrivateKey readPrivateKey() {
        try (Reader reader = Files.newBufferedReader(Paths.get(privateKeyOrg1Usr1), StandardCharsets.UTF_8)) {
            return SecurityUtils.readPrivateKey(reader);
        } catch (InvalidKeyException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Certificate readCertificate() {
        try (Reader reader = Files.newBufferedReader(Paths.get(certificateOrg1Usr1), StandardCharsets.UTF_8)) {
            return SecurityUtils.readX509Certificate(reader);
        } catch (CertificateException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}

package com.trust.service.service;

import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.Signature;
import com.trust.service.model.SubmittedDocument;
import com.trust.service.repository.SignatureRepository;
import com.trust.service.util.XMLUtils;
import org.apache.xml.security.signature.XMLSignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import java.util.List;

@Service
public class VerificationService {

    private final SubmittedDocumentService submittedDocumentService;
    private final OrgInVirtOrgService orgInVirtOrgService;
    private final SignatureRepository signatureRepository;
    private final XMLSigningService xmlSigningService;

    @Autowired
    public VerificationService(SubmittedDocumentService submittedDocumentService, OrgInVirtOrgService orgInVirtOrgService, SignatureRepository signatureRepository, XMLSigningService xmlSigningService) {
        this.submittedDocumentService = submittedDocumentService;
        this.orgInVirtOrgService = orgInVirtOrgService;
        this.signatureRepository = signatureRepository;
        this.xmlSigningService = xmlSigningService;
    }

    public boolean verifyDocument(String apiKey, String name) {
        OrgInVirtOrg orgInVirtOrg = orgInVirtOrgService.findByApiKey(apiKey);
        SubmittedDocument submittedDocument = submittedDocumentService
                .findByName(name);
        // TODO: verify that this org can check/is in the virt org

        List<Signature> signatures = signatureRepository.findAllBySubmittedDocument(submittedDocument);
        return verifyExistingSignatures(submittedDocument, signatures);
    }

    boolean verifyExistingSignatures(SubmittedDocument submittedDocument, List<Signature> signatures) {
        for (Signature signature : signatures) {
            String decodedXML = XMLUtils.decodeString(submittedDocument.getEncodedContent());
            Document document = XMLUtils.getDocumentFromXML(decodedXML);
            if (!verifySignature(document, signature)) {
                return false;
            }
        }
        return true;
    }

    private boolean verifySignature(Document document, Signature signature) {
        String decodedSignature = XMLUtils.decodeString(signature.getEncodedSignature());
        Document signatureDocument = XMLUtils.getDocumentFromXML(decodedSignature);
        Document documentWithSignature = xmlSigningService.combineDocumentAndSignature(document, signatureDocument);

        return xmlSigningService.verifySignature(documentWithSignature);
    }
}

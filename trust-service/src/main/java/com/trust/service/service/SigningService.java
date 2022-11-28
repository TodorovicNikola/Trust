package com.trust.service.service;

import com.trust.service.exception.SubmittedDocumentNotExistException;
import com.trust.service.model.Signature;
import com.trust.service.repository.SignatureRepository;
import com.trust.service.util.XMLUtils;
import org.apache.xml.security.signature.XMLSignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.controller.dto.SignedDocumentDto;
import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SubmittedDocument;
import org.w3c.dom.Document;

import javax.transaction.Transactional;
import java.util.Base64;
import java.util.List;

@Service
public class SigningService {
    private final SubmittedDocumentService submittedDocumentService;
    private final OrgInVirtOrgService orgInVirtOrgService;
    private final SignatureRepository signatureRepository;
    private final XMLSigningService xmlSigningService;

    @Autowired
    public SigningService(SubmittedDocumentService submittedDocumentService, OrgInVirtOrgService orgInVirtOrgService, SignatureRepository signatureRepository, XMLSigningService xmlSigningService) {
        this.submittedDocumentService = submittedDocumentService;
        this.orgInVirtOrgService = orgInVirtOrgService;
        this.signatureRepository = signatureRepository;
        this.xmlSigningService = xmlSigningService;
    }

    @Transactional
    public void save(String apiKey, SignedDocumentDto signedDocumentDto) throws XMLSignatureException, SubmittedDocumentNotExistException {
        OrgInVirtOrg orgInVirtOrg = orgInVirtOrgService.findByApiKey(apiKey);
        SubmittedDocument submittedDocument = submittedDocumentService
                .findByName(signedDocumentDto.getName());

        List<Signature> signatures = signatureRepository.findAllBySubmittedDocument(submittedDocument);
        if (signatures.stream().anyMatch(signature -> signature.getOrgInVirtOrg() == orgInVirtOrg)) {
            return; // org already signed the document
        }
        verifyExistingSignatures(submittedDocument, signatures);

        String signatureXML = signXML(submittedDocument);
        Signature signature = new Signature(orgInVirtOrg, submittedDocument, signatureXML);
        signatureRepository.save(signature);
    }

    private void verifyExistingSignatures(SubmittedDocument submittedDocument, List<Signature> signatures) throws XMLSignatureException {
        String decodedXML = XMLUtils.decodeString(submittedDocument.getEncodedContent());
        Document document = XMLUtils.getDocumentFromXML(decodedXML);

        for (Signature signature : signatures) {
            if (!verifySignature(document, signature)) {
                throw new XMLSignatureException("Signature could not be verified.");
            }
        }
    }

    private boolean verifySignature(Document document, Signature signature) {
        String decodedSignature = XMLUtils.decodeString(signature.getEncodedSignature());
        Document signatureDocument = XMLUtils.getDocumentFromXML(decodedSignature);
        Document documentWithSignature = xmlSigningService.combineDocumentAndSignature(document, signatureDocument);

        return xmlSigningService.verifySignature(documentWithSignature);
    }

    private String signXML(SubmittedDocument submittedDocument) {
        String decodedXML = XMLUtils.decodeString(submittedDocument.getEncodedContent());

        String signatureXML = xmlSigningService.signDocument(decodedXML);

        return Base64.getEncoder().encodeToString(signatureXML.getBytes());
    }
}

package com.trust.service.service;

import com.trust.service.controller.dto.SignatureDTO;
import com.trust.service.exception.SubmittedDocumentNotExistException;
import com.trust.service.model.Signature;
import com.trust.service.repository.SignatureRepository;
import org.apache.xml.security.signature.XMLSignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SubmittedDocument;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SigningService {
    private final SubmittedDocumentService submittedDocumentService;
    private final OrgInVirtOrgService orgInVirtOrgService;
    private final SignatureRepository signatureRepository;

    private final VerificationService verificationService;

    @Autowired
    public SigningService(SubmittedDocumentService submittedDocumentService, OrgInVirtOrgService orgInVirtOrgService, SignatureRepository signatureRepository, XMLSigningService xmlSigningService, VerificationService verificationService) {
        this.submittedDocumentService = submittedDocumentService;
        this.orgInVirtOrgService = orgInVirtOrgService;
        this.signatureRepository = signatureRepository;
        this.verificationService = verificationService;
    }

    @Transactional
    public void save(String apiKey, SignatureDTO signatureDTO) throws XMLSignatureException, SubmittedDocumentNotExistException {
        OrgInVirtOrg orgInVirtOrg = orgInVirtOrgService.findByApiKey(apiKey);
        SubmittedDocument submittedDocument = submittedDocumentService
                .findByName(signatureDTO.getName());

        List<Signature> signatures = signatureRepository.findAllBySubmittedDocument(submittedDocument);
        if (signatures.stream().anyMatch(signature -> signature.getOrgInVirtOrg() == orgInVirtOrg)) {
            return; // org already signed the document
        }
        verificationService.verifyExistingSignatures(submittedDocument, signatures);

        String signatureXML = signatureDTO.getEncodedContent();
        Signature signature = new Signature(orgInVirtOrg, submittedDocument, signatureXML);
        signatureRepository.save(signature);
    }


}

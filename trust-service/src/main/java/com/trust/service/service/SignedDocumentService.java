package com.trust.service.service;

import com.trust.service.model.Signature;
import com.trust.service.repository.SignatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.controller.dto.SignedDocumentDto;
import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SignedDocument;
import com.trust.service.model.SubmittedDocument;
import com.trust.service.repository.SignedDocumentRepository;

import java.util.Base64;

@Service
public class SignedDocumentService {
	private final SignedDocumentRepository signedDocumentRepository;
	private final SubmittedDocumentService submittedDocumentService;
	private final OrgInVirtOrgService orgInVirtOrgService;
    private final SignatureRepository signatureRepository;

    @Autowired
	public SignedDocumentService(SignedDocumentRepository signedDocumentRepository,
                                 SubmittedDocumentService submittedDocumentService, OrgInVirtOrgService orgInVirtOrgService, SignatureRepository signatureRepository) {
		this.signedDocumentRepository = signedDocumentRepository;
		this.submittedDocumentService = submittedDocumentService;
		this.orgInVirtOrgService = orgInVirtOrgService;
        this.signatureRepository = signatureRepository;
    }

	public void save(String apiKey, SignedDocumentDto signedDocumentDto) {
		OrgInVirtOrg orgInVirtOrg = orgInVirtOrgService.findByApiKey(apiKey);
		SubmittedDocument submittedDocument = submittedDocumentService
				.findByOrgInVirtOrgAndName(orgInVirtOrg, signedDocumentDto.getName());

		SignedDocument signedDocument = signedDocumentRepository.save(new SignedDocument(orgInVirtOrg, submittedDocument));

        String signatureXML = signXML(submittedDocument);
        Signature signature = new Signature(orgInVirtOrg, signedDocument, signatureXML);
        signatureRepository.save(signature);
	}

	private String signXML(SubmittedDocument submittedDocument) {
		byte[] decodedBytes = Base64.getDecoder().decode(submittedDocument.getEncodedContent());
		String decodedXML = new String(decodedBytes);

		XMLSigningService xmlSigningService = new XMLSigningService();
		String signatureXML = xmlSigningService.signDocument(decodedXML);

		return Base64.getEncoder().encodeToString(signatureXML.getBytes());
	}
}

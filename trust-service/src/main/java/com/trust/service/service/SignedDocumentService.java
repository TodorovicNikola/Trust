package com.trust.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.controller.dto.SignedDocumentDto;
import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SignedDocument;
import com.trust.service.model.SubmittedDocument;
import com.trust.service.repository.SignedDocumentRepository;

@Service
public class SignedDocumentService {
	private final SignedDocumentRepository signedDocumentRepository;
	private final SubmittedDocumentService submittedDocumentService;
	private final OrgInVirtOrgService orgInVirtOrgService;

	@Autowired
	public SignedDocumentService(SignedDocumentRepository signedDocumentRepository,
			SubmittedDocumentService submittedDocumentService, OrgInVirtOrgService orgInVirtOrgService) {
		this.signedDocumentRepository = signedDocumentRepository;
		this.submittedDocumentService = submittedDocumentService;
		this.orgInVirtOrgService = orgInVirtOrgService;
	}

	public void save(String apiKey, SignedDocumentDto signedDocumentDto) {
		OrgInVirtOrg orgInVirtOrg = orgInVirtOrgService.findByApiKey(apiKey);
		SubmittedDocument submittedDocument = submittedDocumentService
				.findByOrgInVirtOrgAndName(orgInVirtOrg, signedDocumentDto.getName());
		signedDocumentRepository.save(new SignedDocument(orgInVirtOrg, submittedDocument));
	}
}

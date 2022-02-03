package com.trust.service.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.controller.dto.SubmittedDocumentDto;
import com.trust.service.exception.EntityNotExistsException;
import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SubmittedDocument;
import com.trust.service.repository.SubmittedDocumentRepository;

@Service
public class SubmittedDocumentService {
	private final SubmittedDocumentRepository submittedDocumentRepository;
	private final OrgInVirtOrgService orgInVirtOrgService;

	@Autowired
	public SubmittedDocumentService(SubmittedDocumentRepository submittedDocumentRepository,
			OrgInVirtOrgService orgInVirtOrgService) {
		this.submittedDocumentRepository = submittedDocumentRepository;
		this.orgInVirtOrgService = orgInVirtOrgService;
	}

	public void save(String apiKey, SubmittedDocumentDto submittedDocumentDto) {
		OrgInVirtOrg orgInVirtOrg = orgInVirtOrgService.findByApiKey(apiKey);
		submittedDocumentRepository.save(new SubmittedDocument(orgInVirtOrg, submittedDocumentDto.getName(),
				submittedDocumentDto.getEncodedContent()));
	}

	@Transactional
	public SubmittedDocument findByOrgInVirtOrgAndName(OrgInVirtOrg orgInVirtOrg, String name) {
		Optional<SubmittedDocument> submittedDocumentOptional = submittedDocumentRepository
				.findByOrgInVirtOrgAndName(orgInVirtOrg, name);
		if (submittedDocumentOptional.isEmpty()) {
			throw new EntityNotExistsException(
					"Entity with provided organizationId and virtualOrganizationId and name does not exist");
		}

		return submittedDocumentOptional.get();
	}
}

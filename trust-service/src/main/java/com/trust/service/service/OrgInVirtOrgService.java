package com.trust.service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.exception.EntityNotExistsException;
import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.repository.OrgInVirtOrgRepository;

@Service
public class OrgInVirtOrgService {

	private final OrgInVirtOrgRepository orgInVirtOrgRepository;

	@Autowired
	public OrgInVirtOrgService(OrgInVirtOrgRepository orgInVirtOrgRepository) {
		this.orgInVirtOrgRepository = orgInVirtOrgRepository;
	}

	
	public OrgInVirtOrg findByApiKey(String apiKey) {
		Optional<OrgInVirtOrg> orgInVirtOrgOptional = orgInVirtOrgRepository.findByApiKey(apiKey);

		if (orgInVirtOrgOptional.isEmpty()) {
			throw new EntityNotExistsException(
					"Entity with provided organizationId and virtualOrganizationId does not exist");
		}

		return orgInVirtOrgOptional.get();
	}
}

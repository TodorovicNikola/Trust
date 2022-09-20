package com.trust.service.service;

import java.util.Base64;
import java.util.Optional;

import javax.transaction.Transactional;

import com.trust.service.util.XMLUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.service.controller.dto.SubmittedDocumentDto;
import com.trust.service.exception.EntityNotExistsException;
import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SubmittedDocument;
import com.trust.service.repository.SubmittedDocumentRepository;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

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

		String encodedContentSafeForSharing = removeElementsPrivateToOrg(submittedDocumentDto.getEncodedContent());

		submittedDocumentRepository.save(new SubmittedDocument(orgInVirtOrg, submittedDocumentDto.getName(),
				encodedContentSafeForSharing));
	}

	public static String removeElementsPrivateToOrg(String encodedContent) {
		byte[] decodedBytes = Base64.getDecoder().decode(encodedContent);
		String decodedContent = new String(decodedBytes);
		Document document = XMLUtils.getDocumentFromXML(decodedContent);

		removeElementsPrivateToOrg(document);

		String contentSafeForSharing = XMLUtils.getXMLFromDocument(document);
		return Base64.getEncoder().encodeToString(contentSafeForSharing.getBytes());
	}

	private static void removeElementsPrivateToOrg(Document document) {
		NodeList nodeList = document.getElementsByTagName("elements");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			Element parent = (Element) element.getParentNode();
			// These elements are on CBP layer, we don't touch those
			if (parent.getTagName().equals("organizations"))
				continue;
			// Element's without this attribute should be removed
			if (!element.hasAttribute("exposeToCollaboratingParties"))
				element.getParentNode().removeChild(element);
		}
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

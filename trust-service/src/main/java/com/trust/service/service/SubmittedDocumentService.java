package com.trust.service.service;

import java.util.Base64;
import java.util.Optional;

import javax.transaction.Transactional;

import com.trust.service.exception.SubmittedDocumentNotExistException;
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

		assert document != null;
		removeElementsPrivateToOrg(document.getDocumentElement());

		String contentSafeForSharing = XMLUtils.getXMLFromDocument(document);
		return Base64.getEncoder().encodeToString(contentSafeForSharing.getBytes());
	}

	private static void removeElementsPrivateToOrg(Element element) {
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element child = (Element) nodeList.item(i);
				// These elements are on CBP layer, we don't touch those
				if (element.getTagName().equals("organizations"))
					continue;
				// Elements without this attribute should be removed
				if (child.hasAttribute("exposeToCollaboratingParties"))
					removeElementsPrivateToOrg(child);
				else
					element.removeChild(child);
			}
		}
	}

	@Transactional
	public SubmittedDocument findByName(String name) throws SubmittedDocumentNotExistException {
		Optional<SubmittedDocument> submittedDocumentOptional = submittedDocumentRepository
				.findByName(name);
		if (submittedDocumentOptional.isEmpty()) {
			throw new SubmittedDocumentNotExistException(
					"Submitted document with provided name does not exist");
		}

		return submittedDocumentOptional.get();
	}
}

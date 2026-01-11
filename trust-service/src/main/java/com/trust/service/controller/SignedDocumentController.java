package com.trust.service.controller;

import com.trust.service.controller.dto.SignatureDTO;
import com.trust.service.exception.SubmittedDocumentNotExistException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trust.service.controller.dto.SignedDocumentDto;
import com.trust.service.service.SigningService;

@RestController
@RequestMapping(value = "/signed_documents")
public class SignedDocumentController {
	private final SigningService signingService;

	@Autowired
	public SignedDocumentController(SigningService signingService) {
		this.signingService = signingService;
	}

	@PostMapping
	public ResponseEntity postSignedDocument(@RequestHeader("Authorization") String apiKey,
			@RequestBody SignatureDTO signatureDTO) {
		try {
			signingService.save(apiKey, signatureDTO);
		} catch (XMLSignatureException | SubmittedDocumentNotExistException e) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.noContent().build();

	}
}

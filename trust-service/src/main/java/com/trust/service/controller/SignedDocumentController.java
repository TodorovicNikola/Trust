package com.trust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trust.service.controller.dto.SignedDocumentDto;
import com.trust.service.controller.dto.SubmittedDocumentDto;
import com.trust.service.service.SignedDocumentService;
import com.trust.service.service.SubmittedDocumentService;

@RestController
@RequestMapping(value = "/signed_documents")
public class SignedDocumentController {
	private final SignedDocumentService signedDocumentService;

	@Autowired
	public SignedDocumentController(SignedDocumentService signedDocumentService) {
		this.signedDocumentService = signedDocumentService;
	}

	@PostMapping
	public ResponseEntity postSignedDocument(@RequestHeader("Authorization") String apiKey,
			@RequestBody SignedDocumentDto signedDocumentDto) {
		signedDocumentService.save(apiKey, signedDocumentDto);
		return ResponseEntity.noContent().build();

	}
}

package com.trust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trust.service.controller.dto.SubmittedDocumentDto;
import com.trust.service.service.SubmittedDocumentService;

@RestController
@RequestMapping(value = "/submitted_documents")
public class SubmittedDocumentController {

	private final SubmittedDocumentService submittedDocumentService;

	@Autowired
	public SubmittedDocumentController(SubmittedDocumentService submittedDocumentService) {
		this.submittedDocumentService = submittedDocumentService;
	}

	@PostMapping
	public ResponseEntity postSubmittedDocument(@RequestHeader("Authorization") String apiKey,
			@RequestBody SubmittedDocumentDto submittedDocumentDto) {
		submittedDocumentService.save(apiKey, submittedDocumentDto);
		return ResponseEntity.noContent().build();

	}
}

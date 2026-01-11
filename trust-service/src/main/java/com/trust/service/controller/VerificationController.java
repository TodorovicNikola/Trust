package com.trust.service.controller;

import com.trust.service.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/verify")
public class VerificationController {

    private final VerificationService verificationService;

    @Autowired
    public VerificationController(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    @GetMapping
    public ResponseEntity<Boolean> verifyDocument(@RequestHeader("Authorization") String apiKey,
                                                  @RequestParam String name) {
        boolean isValid = verificationService.verifyDocument(apiKey, name);
        return ResponseEntity.ok(isValid);
    }
}

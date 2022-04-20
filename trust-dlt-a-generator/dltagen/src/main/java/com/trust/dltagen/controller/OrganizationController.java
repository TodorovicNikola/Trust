package com.trust.dltagen.controller;

import com.trust.dltagen.dto.CertificateAuthorityDTO;
import com.trust.dltagen.dto.OrganizationDTO;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.service.OrganizationService;
import freemarker.template.TemplateException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequestMapping("organization")
public class OrganizationController {

    private final OrganizationService service;

    public OrganizationController(OrganizationService service) {
        this.service = service;
    }

    @PostMapping("{id}/ca")
    public OrganizationDTO addCA(@PathVariable String id, @RequestBody CertificateAuthorityDTO ca) {
        Organization organization = service.addCA(id, ca);
        return new OrganizationDTO(organization);
    }

    @GetMapping(value = "{id}/ca-config", produces = "application/x-yaml")
    public ResponseEntity<InputStreamResource> getCAConfig(@PathVariable String id) throws TemplateException, IOException {
        byte[] bytes = service.getCAConfig(id);

        InputStreamResource body = new InputStreamResource(new ByteArrayInputStream(bytes));

        return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/x-yaml"))
                .header("Content-Disposition", "attachment; filename=caconfig.yaml")
                .body(body);
    }

    @PostMapping(value = "{id}/crypto", produces = "application/zip")
    public ResponseEntity<InputStreamResource> generateCryptomaterial(@PathVariable String id, @RequestParam("pem")MultipartFile pem) throws TemplateException, IOException {
        byte[] cryptomaterial = service.generateCryptomaterial(id, pem);

        InputStreamResource body = new InputStreamResource(new ByteArrayInputStream(cryptomaterial));

        return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/zip"))
                .header("Content-Disposition", "attachment; filename=crypto.zip")
                .body(body);
    }

    @GetMapping(value = "{id}/config", produces = "application/x-yaml")
    public ResponseEntity<InputStreamResource> getConfig(@PathVariable String id) throws TemplateException, IOException {
        byte[] bytes = service.getConfig(id);
        InputStreamResource body = new InputStreamResource(new ByteArrayInputStream(bytes));

        return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/x-yaml"))
                .header("Content-Disposition", "attachment; filename=config.yaml")
                .body(body);
    }
}

package com.trust.dltagen.controller;

import com.trust.dltagen.dto.OrganizationDTO;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.service.OrdererService;
import freemarker.template.TemplateException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("orderer")
public class OrdererController {
    private final OrdererService service;

    public OrdererController(OrdererService service) {
        this.service = service;
    }

    @GetMapping()
    public List<OrganizationDTO> getAll() {
        Organization orderer = service.getOrderer();
        List<OrganizationDTO> orderers = new ArrayList<>();
        orderers.add(new OrganizationDTO(orderer));

        return orderers;
    }

    @PostMapping(value = "crypto", produces = "application/zip")
    public ResponseEntity<InputStreamResource> generateCryptomaterial(@RequestParam("pem") MultipartFile pem) throws TemplateException, IOException {
        byte[] cryptomaterial = service.generateCryptomaterial(pem);

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

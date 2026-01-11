package com.trust.dltagen.service;

import com.trust.dltagen.model.Organization;
import com.trust.dltagen.model.OrganizationStatus;
import com.trust.dltagen.repository.OrganizationRepository;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@Service
public class OrdererService {
    private final OrganizationRepository repository;
    private final CryptoService cryptoService;
    private final FileService fileService;

    private final TemplateService templateService;

    public OrdererService(OrganizationRepository repository, CryptoService cryptoService, FileService fileService, TemplateService templateService) {
        this.repository = repository;
        this.cryptoService = cryptoService;
        this.fileService = fileService;
        this.templateService = templateService;
    }

    public Organization getOrderer() {
        return repository.findByName("orderer").get(0);
    }

    public byte[] generateCryptomaterial(MultipartFile pem) throws TemplateException, IOException {
        Organization orderer = getOrderer();
        cryptoService.generateOrdererCryptomaterial(orderer, pem);

        orderer.setStatus(OrganizationStatus.UP);
        repository.save(orderer);

        return fileService.zipDir("organizations/ordererOrganizations/"+orderer.getName());
    }

    public byte[] getConfig(String id) throws TemplateException, IOException {
        Organization found = repository.getById(id);
        return templateService.getOrdererConfig(found);
    }
}

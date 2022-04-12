package com.trust.dltagen.service;

import com.trust.dltagen.dto.CertificateAuthorityDTO;
import com.trust.dltagen.model.CertificateAuthority;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.repository.OrganizationRepository;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class OrganizationService {

    private final OrganizationRepository repository;

    private final CertificateAuthorityService caService;
    private final TemplateService templateService;

    public OrganizationService(OrganizationRepository repository, CertificateAuthorityService caService, TemplateService templateService) {
        this.repository = repository;
        this.caService = caService;
        this.templateService = templateService;
    }

    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    public Organization getById(String id) {
        return repository.getById(id);
    }

    public Organization addCA(String orgId, CertificateAuthorityDTO ca) {
        Organization found = repository.getById(orgId);

        CertificateAuthority newCa = new CertificateAuthority(ca.getId(), found.getName() + "_ca", ca.getHost(), ca.getPort(), ca.getOpPort(), ca.getAdminName(), ca.getAdminPassword());

        CertificateAuthority saved = caService.save(newCa);
        found.setCertificateAuthority(saved);

        return repository.save(found);
    }

    public byte[] getCAConfig(String organizationId) throws TemplateException, IOException {
        Organization found = repository.getById(organizationId);
        return templateService.getCAConfig(found.getName(), found.getCertificateAuthority());
    }
}

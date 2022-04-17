package com.trust.dltagen.service;

import com.trust.dltagen.dto.CertificateAuthorityDTO;
import com.trust.dltagen.model.CertificateAuthority;
import com.trust.dltagen.model.Organization;
import com.trust.dltagen.repository.OrganizationRepository;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@Service
public class OrganizationService {

    private final OrganizationRepository repository;
    private final FileService fileService;
    private final CertificateAuthorityService caService;
    private final TemplateService templateService;
    private final ScriptExecutionService scriptExecutionService;

    public OrganizationService(OrganizationRepository repository, CertificateAuthorityService caService, TemplateService templateService, FileService fileService, ScriptExecutionService scriptExecutionService) {
        this.repository = repository;
        this.caService = caService;
        this.templateService = templateService;
        this.fileService = fileService;
        this.scriptExecutionService = scriptExecutionService;
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

    public byte[] generateCryptomaterial(String organizationId, MultipartFile pem) throws TemplateException, IOException {
        Organization found = repository.getById(organizationId);
        String pemFilePath = fileService.store(found.getName()+".pem", pem, "pem");

        String path = fileService.getRootDir() + "/organizations/peerOrganizations/" + found.getName();
        String caClientHome = (new File(path)).getAbsolutePath();
        String peerHome = caClientHome + "/peers/" + found.getPeer().getName() + "." + found.getName();

        byte[] enrollmentScript = templateService.getCAEnrollmentScript(found, (new File(pemFilePath)).getAbsolutePath(), caClientHome, peerHome);
        String enrollmentScriptPath = fileService.store(found.getCertificateAuthority().getName() + "enroll.sh", enrollmentScript, "scripts");

        scriptExecutionService.execute(enrollmentScriptPath);
        return fileService.zipDir("organizations/peerOrganizations/" + found.getName());
    }
}

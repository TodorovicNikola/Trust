package com.trust.dltagen.service;

import com.trust.dltagen.model.Organization;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class CryptoService {
    private final FileService fileService;
    private final TemplateService templateService;
    private final ScriptExecutionService scriptExecutionService;

    public CryptoService(FileService fileService, TemplateService templateService, ScriptExecutionService scriptExecutionService) {
        this.fileService = fileService;
        this.templateService = templateService;
        this.scriptExecutionService = scriptExecutionService;
    }

    public void generateOrganizationCryptomaterial(Organization organization, MultipartFile pem) throws TemplateException, IOException {
        fileService.deleteDir("organizations", "peerOrganizations");

        String path = fileService.getRootDir() + "/organizations/peerOrganizations/" + organization.getName();
        String caClientHome = (new File(path)).getAbsolutePath();
        String peerHome = caClientHome + "/peers/" + organization.getPeer().getName() + "." + organization.getName();

        generateCryptomaterial(organization, pem, caClientHome, peerHome);
        generateCcpJson(organization);
        generateCcpYaml(organization);
        generatePeerConfig(organization);
    }

    public void generateOrdererCryptomaterial(Organization organization, MultipartFile pem) throws TemplateException, IOException {
        fileService.deleteDir("organizations", "ordererOrganizations");

        String path = fileService.getRootDir() + "/organizations/ordererOrganizations/" + organization.getName();
        String caClientHome = (new File(path)).getAbsolutePath();
        String peerHome = caClientHome + "/orderers/" + organization.getPeer().getName() + "." + organization.getName();

        generateCryptomaterial(organization, pem, caClientHome, peerHome);
    }

    private void generateCcpJson(Organization organization) throws TemplateException, IOException {
        byte[] ccpJson = templateService.getCCPjson(organization);
        fileService.store("connection-" + organization.getName()+".json", ccpJson, "organizations", "peerOrganizations", organization.getName());
    }

    private void generateCcpYaml(Organization organization) throws TemplateException, IOException {
        byte[] ccpYaml = templateService.getCCPyaml(organization);
        fileService.store("connection-" + organization.getName()+".yaml", ccpYaml, "organizations", "peerOrganizations", organization.getName());
    }

    private void generatePeerConfig(Organization organization) throws TemplateException, IOException {
        byte[] peercfg = templateService.getPeercfg(organization);
        fileService.store("core.yaml", peercfg, "organizations", "peerOrganizations", organization.getName(), "peers", organization.getPeer().getName() +"."+organization.getName(), "peercfg");
    }

    private void generateCryptomaterial(Organization organization, MultipartFile pem, String caClientHome, String peerHome) throws TemplateException, IOException {
        String pemFilePath = fileService.store(organization.getName()+".pem", pem, "pem");

        byte[] enrollmentScript = templateService.getCAEnrollmentScript(organization, (new File(pemFilePath)).getAbsolutePath(), caClientHome, peerHome);
        String enrollmentScriptPath = fileService.store(organization.getCertificateAuthority().getName() + "-enroll.sh", enrollmentScript, "scripts");

        scriptExecutionService.execute(enrollmentScriptPath);
    }
}

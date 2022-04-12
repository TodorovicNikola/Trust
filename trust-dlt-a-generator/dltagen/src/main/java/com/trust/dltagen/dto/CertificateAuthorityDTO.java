package com.trust.dltagen.dto;

import com.trust.dltagen.model.CertificateAuthority;

public class CertificateAuthorityDTO {
    private Long id;
    private String name;
    private String host;
    private String port;
    private String opPort;
    private String adminName;
    private String adminPassword;

    public CertificateAuthorityDTO() {

    }

    public CertificateAuthorityDTO(Long id, String name, String host, String port, String opPort, String adminName, String adminPassword) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;
        this.opPort = opPort;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public CertificateAuthorityDTO(CertificateAuthority ca) {
        this.id = ca.getId();
        this.name = ca.getName();
        this.host = ca.getHost();
        this.port = ca.getPort();
        this.opPort = ca.getOpPort();
        this.adminName = ca.getAdminName();
        this.adminPassword = ca.getAdminPassword();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getOpPort() {
        return opPort;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }
}

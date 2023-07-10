package com.trust.dltagen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CertificateAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String host;
    private String port;
    private String opPort;
    private String adminName;
    private String adminPassword;

    public CertificateAuthority() {

    }

    public CertificateAuthority(Long id, String name, String host, String port, String opPort, String adminName, String adminPassword) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;
        this.opPort = opPort;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
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

package com.trust.dltagen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CertificateAuthority {
    @Id
    private Long id;
    private String name;
    private String host;
    private int port;
    private int operationsPort;
    private String adminName;
    private String adminSecret;

    public CertificateAuthority() {

    }

    public CertificateAuthority(Long id, String name, String host, int port, int operationsPort, String adminName, String adminSecret) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;
        this.operationsPort = operationsPort;
        this.adminName = adminName;
        this.adminSecret = adminSecret;
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

    public int getPort() {
        return port;
    }

    public int getOperationsPort() {
        return operationsPort;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminSecret() {
        return adminSecret;
    }
}

package com.trust.dltagen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Orderer {
    @Id
    private String id;
    private String name;
    private String domain;
    private String secret;
    private String host;
    private int port;
    private int adminPort;
    private int operationsPort;
    @OneToOne
    private CertificateAuthority certificateAuthority;

    public Orderer() {

    }

    public Orderer(String id, String name, String domain, String secret, String host, int port, int adminPort, int operationsPort, CertificateAuthority certificateAuthority) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.secret = secret;
        this.host = host;
        this.port = port;
        this.adminPort = adminPort;
        this.operationsPort = operationsPort;
        this.certificateAuthority = certificateAuthority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public String getSecret() {
        return secret;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public int getAdminPort() {
        return adminPort;
    }

    public int getOperationsPort() {
        return operationsPort;
    }

    public CertificateAuthority getCertificateAuthority() {
        return certificateAuthority;
    }
}

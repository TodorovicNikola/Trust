package com.trust.dltagen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Organization {
    @Id
    private String id;
    private String name;
    private String role;
    private String domain;
    private String host;
    private String port;
    private String mspId;
    private String adminName;
    private String adminSecret;
    @OneToOne
    private Client client;
    @OneToOne
    private CertificateAuthority certificateAuthority;
    private OrganizationStatus status;

    public Organization() {

    }

    public Organization(String id, String name, String role, String domain, String host, String port, String mspId, String adminName, String adminSecret, Client client, CertificateAuthority certificateAuthority, OrganizationStatus status) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.domain = domain;
        this.host = host;
        this.port = port;
        this.mspId = mspId;
        this.adminName = adminName;
        this.adminSecret = adminSecret;
        this.client = client;
        this.certificateAuthority = certificateAuthority;
        this.status = status;
    }

    public Organization(com.trust40.multi_pro_lan.parser.model.Organization organization) {
        this.id = organization.getId();
        this.name = organization.getName();
        this.host = organization.getHost();
        this.port = organization.getPort();
        this.role = organization.getRole();
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

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getMspId() {
        return mspId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminSecret() {
        return adminSecret;
    }

    public Client getClient() {
        return client;
    }

    public CertificateAuthority getCertificateAuthority() {
        return certificateAuthority;
    }

    public OrganizationStatus getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }

    public void setStatus(OrganizationStatus status) {
        this.status = status;
    }

    public void setCertificateAuthority(CertificateAuthority certificateAuthority) {
        this.status = OrganizationStatus.CA_READY;
        this.certificateAuthority = certificateAuthority;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", domain='" + domain + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", mspId='" + mspId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminSecret='" + adminSecret + '\'' +
                ", client=" + client +
                //", certificateAuthority=" + certificateAuthority +
                ", status=" + status +
                '}';
    }
}

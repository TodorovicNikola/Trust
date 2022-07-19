package com.trust.dltagen.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Organization {
    @Id
    private String id;
    private String name;

    private String fullName;
    private String host;
    private String port;
    private String opPort;
    private String role;
    private String mspId;
    @OneToOne(cascade = CascadeType.ALL)
    private Client user;
    @OneToOne(cascade = CascadeType.ALL)
    private Client admin;
    @OneToOne(cascade = CascadeType.ALL)
    private Client peer;
    @OneToOne
    private CertificateAuthority certificateAuthority;
    private OrganizationStatus status;

    protected Organization() {
        this.admin = new Client("admin", "adminpw");
        this.peer = new Client("peer0", "peer0pw");
        this.user = new Client("user1", "user1pw");
        this.opPort = "9999";
    }

    public Organization(String id, String name, String host, String port, String role) {
        this();
        this.id = id;
        this.fullName = name;
        this.name = name.toLowerCase().replace(' ', '-');
        this.role = role;
        this.host = host;
        this.port = port;
        this.mspId = this.name + "MSP";
    }

    public Organization(com.trust40.multi_pro_lan.parser.model.Organization organization) {
        this(organization.getId(), organization.getName(), organization.getHost(), organization.getPort(), organization.getRole());
    }

    public String getId() {
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

    public String getMspId() {
        return mspId;
    }

    public Client getUser() {
        return user;
    }

    public String getOpPort() {
        return opPort;
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

    public Client getAdmin() {
        return admin;
    }

    public Client getPeer() {
        return peer;
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
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", mspId='" + mspId + '\'' +
                ", client=" + user +
                //", certificateAuthority=" + certificateAuthority +
                ", status=" + status +
                '}';
    }
}

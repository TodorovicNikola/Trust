package com.trust.dltagen.dto;

import com.trust.dltagen.model.Organization;
import com.trust.dltagen.model.OrganizationStatus;

public class OrganizationDTO {
    private String id;
    private String name;
    private String role;
    private String host;
    private String port;
    private OrganizationStatus status;
    private CertificateAuthorityDTO ca;

    public OrganizationDTO() {

    }

    public OrganizationDTO(String id, String name, String role, String host, String port, OrganizationStatus status) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.host = host;
        this.port = port;
        this.status = status;
    }

    public OrganizationDTO(Organization organization) {
        this.id = organization.getId();
        this.name = organization.getName();
        this.host = organization.getHost();
        this.port = organization.getPort();
        this.status = organization.getStatus();
        this.role = organization.getRole();

        if(organization.getCertificateAuthority() != null) {
            this.ca = new CertificateAuthorityDTO(organization.getCertificateAuthority());
        }
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

    public OrganizationStatus getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }

    public CertificateAuthorityDTO getCa() {
        return ca;
    }

    public void setStatus(OrganizationStatus status) {
        this.status = status;
    }
}

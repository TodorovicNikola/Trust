package com.trust.dltagen.dto;

import com.trust.dltagen.model.Organization;
import com.trust.dltagen.model.OrganizationRole;
import com.trust.dltagen.model.OrganizationStatus;

public class ChannelOrganizationDTO {
    private String id;
    private String name;
    private OrganizationRole role;
    private String host;
    private String port;
    private OrganizationStatus status;

    public ChannelOrganizationDTO() {

    }

    public ChannelOrganizationDTO(String id, String name, OrganizationRole role, String host, String port, OrganizationStatus status) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.host = host;
        this.port = port;
        this.status = status;
    }

    public ChannelOrganizationDTO(Organization organization) {
        this.id = organization.getId();
        this.name = organization.getName();
        this.host = organization.getHost();
        this.port = organization.getPort();
        this.status = organization.getStatus();
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

    public OrganizationRole getRole() {
        return role;
    }

    public void setStatus(OrganizationStatus status) {
        this.status = status;
    }
}

package com.trust.dltagen.dto;

import com.trust.dltagen.model.Channel;
import com.trust.dltagen.model.ChannelStatus;
import com.trust.dltagen.model.Organization;

import java.util.ArrayList;
import java.util.List;

public class ChannelProcessDTO {
    private String id;
    private String name;
    private ChannelStatus status;
    private String endorsementPolicy;
    private List<OrganizationDTO> organizations = new ArrayList<>();

    public ChannelProcessDTO() {

    }

    public ChannelProcessDTO(String id, String name, ChannelStatus status, String endorsementPolicy) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.endorsementPolicy = endorsementPolicy;
    }

    public ChannelProcessDTO(Channel channel) {
        this.id = channel.getId();
        this.name = channel.getName();
        this.endorsementPolicy = channel.getEndorsementPolicy();
        this.status = channel.getStatus();

        channel.getOrganizations().forEach(this::addOrganization);
    }

    public void addOrganization(Organization organization) {
        OrganizationDTO organizationDTO = new OrganizationDTO(organization);
        organizations.add(organizationDTO);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ChannelStatus getStatus() {
        return status;
    }

    public String getEndorsementPolicy() {
        return endorsementPolicy;
    }

    public List<OrganizationDTO> getOrganizations() {
        return organizations;
    }

    public void setStatus(ChannelStatus status) {
        this.status = status;
    }
}

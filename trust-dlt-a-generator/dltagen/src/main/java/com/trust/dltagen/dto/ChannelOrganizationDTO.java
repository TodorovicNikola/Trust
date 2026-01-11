package com.trust.dltagen.dto;

public class ChannelOrganizationDTO {

    private String channelId;
    private OrganizationDTO organization;

    public ChannelOrganizationDTO() {

    }

    public ChannelOrganizationDTO(String channelId, OrganizationDTO organization) {
        this.channelId = channelId;
        this.organization = organization;
    }

    public String getChannelId() {
        return channelId;
    }

    public OrganizationDTO getOrganization() {
        return organization;
    }
}

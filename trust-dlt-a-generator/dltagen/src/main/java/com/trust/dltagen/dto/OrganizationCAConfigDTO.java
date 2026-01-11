package com.trust.dltagen.dto;

import com.trust.dltagen.model.Organization;

public class OrganizationCAConfigDTO {
    private OrganizationDTO organization;
    private String caConfig;

    public OrganizationCAConfigDTO() {

    }

    public OrganizationCAConfigDTO(OrganizationDTO organization, String caConfig) {
        this.organization = organization;
        this.caConfig = caConfig;
    }

    public OrganizationCAConfigDTO(Organization organization, String caConfig) {
        this.organization = new OrganizationDTO(organization);
        this.caConfig = caConfig;
    }

    public OrganizationDTO getOrganization() {
        return organization;
    }

    public String getCaConfig() {
        return caConfig;
    }
}

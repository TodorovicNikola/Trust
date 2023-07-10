package com.trust40.multi_pro_lan.parser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VirtualOrganization {
    private String id;
    private String name;
    private String endorsementPolicy;
    private List<Organization> organizations = new ArrayList<>();

    public VirtualOrganization() {}

    public VirtualOrganization(String id, String name, String endorsementPolicy) {
        this.id = id;
        this.name = name;
        this.endorsementPolicy = endorsementPolicy;
    }

    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VirtualOrganization virtualOrganization = (VirtualOrganization) o;
        return Objects.equals(id, virtualOrganization.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEndorsementPolicy() {
        return endorsementPolicy;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = " + id +
                "\nname = " + name +
                "\nendorsementPolicy = " + endorsementPolicy +
                "\norganizations:\n");
        for(Organization sl: organizations) {
            sb.append(sl);
        }
        return sb.toString();
    }
}

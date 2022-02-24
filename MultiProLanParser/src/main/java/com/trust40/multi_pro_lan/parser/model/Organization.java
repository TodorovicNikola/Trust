package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

import java.util.Objects;

public class Organization  extends IDNamedElement{

    private String role;
    private String host;
    private String port;

    public Organization(Element element) {
        super(element, "BROKER");
        this.role = element.getAttribute("OrganizationRole");
        this.host = element.getAttribute("dltPeerAddress").split(":")[0];
        this.port = element.getAttribute("dltPeerAddress").split(":")[1];

        if(this.role.equals("")) {
            this.role = this.type;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization organization = (Organization) o;
        return Objects.equals(id, organization.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "role='" + role + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }
}

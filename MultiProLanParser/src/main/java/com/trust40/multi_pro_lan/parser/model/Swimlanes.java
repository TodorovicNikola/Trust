package com.trust40.multi_pro_lan.parser.model;

import java.util.Objects;

public class Swimlanes {
    private String id;
    private String name;
    private OrganizationRole role;
    private String host;
    private String port;

    public Swimlanes(String id, String name, String role, String host, String port) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;

        if("".equals(role)) {
            this.role = OrganizationRole.BROKER;
        } else if("CORE_PARTNER".equals(role)) {
            this.role = OrganizationRole.CORE_PARTNER;
        } else if("ADDITIONAL_PARTNER".equals(role)) {
            this.role = OrganizationRole.ADDITIONAL_PARTNER;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swimlanes swimlanes = (Swimlanes) o;
        return Objects.equals(id, swimlanes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\tid = " + id +
                "\n\tname = " + name +
                "\n\trole = " + role +
                "\n\thost = " + host +
                "\n\tport = " + port + "\n\n";
    }
}

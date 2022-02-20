package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

import java.util.Objects;

public class Swimlanes {
    private String id;
    private String name;
    private String role;
    private String host;
    private String port;

    public Swimlanes(String id, String name, String role, String host, String port) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;

        if(role.equals("")) {
            this.role = "BROKER";
        }
    }

    public Swimlanes(Element element) {
        this.id = element.getAttribute("id");
        this.name = element.getAttribute("OrganizationName");
        this.role = element.getAttribute("OrganizationRole");
        this.host = element.getAttribute("host");
        this.port = element.getAttribute("port");

        if(this.role.equals("")) {
            this.role = "BROKER";
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

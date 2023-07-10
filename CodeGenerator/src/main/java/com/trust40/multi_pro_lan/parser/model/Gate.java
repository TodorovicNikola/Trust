package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

public class Gate extends ProcessElement {
    protected Organization organization;

    public Gate(Element gateElement) {
        super(gateElement, "DECISION");
    }

    public Gate(Element gateElement, Element organizationElement) {
        super(gateElement, "DECISION");

        organization = new Organization(organizationElement);
    }

    public String toString() {
        return String.format("Gate[id=%s, name=%s, gateType=%s, organization=%s]", id, name, type, organization);
    }
}

package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

public class Swimlane extends IDNamedElement {
    public Swimlane(Element swimlaneElement) {
        super(swimlaneElement, "BROKER");
    }

    @Override
    public String toString() {
        return String.format("Swimlane[id=%s, name=%s, type=%s]", id, name, type);
    }
}

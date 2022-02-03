package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

public class Gate extends ProcessElement {
    protected Swimlane swimlane;

    public Gate(Element gateElement) {
        super(gateElement, "DECISION");
    }

    public Gate(Element gateElement, Element swimlaneElement) {
        super(gateElement, "DECISION");

        swimlane = new Swimlane(swimlaneElement);
    }

    public String toString() {
        return String.format("Gate[id=%s, name=%s, gateType=%s, swimlane=%s]", id, name, type, swimlane);
    }
}

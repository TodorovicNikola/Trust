package com.trust40.col_pro_lan.parser.model;


import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcessElement extends IDNamedElement {
    private List<Relationship> incomingRelationship = new ArrayList<>();
    private List<Relationship> outgoingRelationship = new ArrayList<>();

    ProcessElement(Element element, String defaultTypeForSubclass) {
        super(element, defaultTypeForSubclass);
    }

    public List<Relationship> getIncomingRelationship() {
        return incomingRelationship;
    }

    public List<Relationship> getOutgoingRelationship() {
        return outgoingRelationship;
    }
}

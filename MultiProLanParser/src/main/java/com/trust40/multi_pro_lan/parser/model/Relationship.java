package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

public class Relationship extends IDNamedElement {
    private String sourceId;
    private String targetId;

    private ProcessElement source;
    private ProcessElement target;

    public Relationship(Element relationshipElement) {
        super(relationshipElement, "FLOW");

        String[] element_ids = name.split("_");
        sourceId = element_ids[0];
        targetId = element_ids[1];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getTargetId() {
        return targetId;
    }

    public ProcessElement getSource() {
        return source;
    }

    public ProcessElement getTarget() {
        return target;
    }

    public void setSource(ProcessElement source) {
        this.source = source;
    }

    public void setTarget(ProcessElement target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return String.format("Relationship[id=%s, name=%s, sourceId=%s, targetId=%s]", id, name, sourceId, targetId);
    }
}

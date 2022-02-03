package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class ProcessStep extends ProcessElement {
    protected Capability capability;
    protected List<Product> inputProducts = new ArrayList<>();
    protected Swimlane swimlane;

    public ProcessStep(Element processStepElement) {
        super(processStepElement, "REGULAR");

        if (processStepElement.hasChildNodes()) {
            for (int j = 0; j < processStepElement.getElementsByTagName("inProducts").getLength(); j++) {
                org.w3c.dom.Element inputProductElement = (org.w3c.dom.Element) processStepElement.getElementsByTagName("inProducts").item(j);
                if (Boolean.parseBoolean(inputProductElement.getAttribute("exposeToCollaboratingParties"))) {
                    inputProducts.add(new Product(inputProductElement));
                }

            }

            org.w3c.dom.Element capabilityElement = (org.w3c.dom.Element) processStepElement.getElementsByTagName("capability").item(0);
            if (Boolean.parseBoolean(capabilityElement.getAttribute("exposeToCollaboratingParties"))) {
                capability = new Capability(capabilityElement);
            }
        }
    }

    public ProcessStep(Element processStepElement, Element swimlaneElement) {
        super(processStepElement, "REGULAR");

        swimlane = new Swimlane(swimlaneElement);

        org.w3c.dom.Element capabilityElement = (org.w3c.dom.Element) processStepElement.getElementsByTagName("capability").item(0);
        if (capabilityElement != null) {
            capability = new Capability(capabilityElement);

        }
    }

    public Capability getCapability() {
        return capability;
    }

    public List<Product> getInputProducts() {
        return inputProducts;
    }

    public Swimlane getSwimlane() {
        return swimlane;
    }

    public String toString() {
        return String.format("ProcessStep[id=%s, name=%s, capability=%s, inputProducts=%s, swimlane=%s]", id, name, capability, inputProducts, swimlane);
    }
}

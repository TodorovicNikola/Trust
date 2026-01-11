package com.trust40.col_pro_lan.parser.model;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class ProcessStep extends ProcessElement {
    protected Capability capability;
    protected ContractualObligation contractualObligation;
    protected List<Product> inputProducts = new ArrayList<>();
    protected Organization organization;
    protected String relatedInterfaceProcessId;

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

    public ProcessStep(Element processStepElement, Element organizationElement) {
        super(processStepElement, "REGULAR");

        organization = new Organization(organizationElement);

        org.w3c.dom.Element capabilityElement = (org.w3c.dom.Element) processStepElement.getElementsByTagName("capability").item(0);
        if (capabilityElement != null) {
            capability = new Capability(capabilityElement);

        }

        org.w3c.dom.Element contractualObligationElement = (org.w3c.dom.Element) processStepElement.getElementsByTagName("contractualObligation").item(0);
        if (contractualObligationElement != null) {
            contractualObligation = new ContractualObligation(contractualObligationElement);

        }

        org.w3c.dom.Element relatedInterfaceProcessElement = (org.w3c.dom.Element) processStepElement.getElementsByTagName("relatedInterfaceProcess").item(0);
        if (relatedInterfaceProcessElement != null) {
            relatedInterfaceProcessId = relatedInterfaceProcessElement.getAttribute("href").split("\\.")[0];

        }

    }

    public Capability getCapability() {
        return capability;
    }

    public ContractualObligation getContractualObligation() {
        return contractualObligation;
    }

    public List<Product> getInputProducts() {
        return inputProducts;
    }

    public Organization getOrganization() {
        return organization;
    }

    public String getRelatedInterfaceProcessId() {
        return relatedInterfaceProcessId;
    }

    public String toString() {
        return String.format("ProcessStep[id=%s, name=%s, capability=%s, contractualObligation=%s, inputProducts=%s, organization=%s, relatedInterfaceProcessId=%s]", id, name, capability, contractualObligation, inputProducts, organization, relatedInterfaceProcessId);
    }
}

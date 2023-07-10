package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class Capability {
    private String id;
    private String name;
    private List<Constraint> constraints = new ArrayList<>();
    private List<Parameter> parameters = new ArrayList<>();

    public Capability(Element capabilityElement) {
        id = capabilityElement.hasAttribute("id") ? capabilityElement.getAttribute("id") : "";
        name = capabilityElement.hasAttribute("name") ? capabilityElement.getAttribute("name") : "";

        NodeList constraintNodes = capabilityElement.getElementsByTagName("constraints");

        for (int i = 0; i < constraintNodes.getLength(); i++) {

            Element constraintElement = (org.w3c.dom.Element) constraintNodes.item(i);
            Constraint constraint = new Constraint(constraintElement);
            if (constraint.getPersisted()) { // adding only constraints about which data is expected to be persisted; the rest are not needed for now (if you update this, you need to update freemarker templates as well)
                constraints.add(constraint);

            }
        }

        NodeList parameterNodes = capabilityElement.getElementsByTagName("parameters");

        for (int i = 0; i < parameterNodes.getLength(); i++) {

            Element parameterElement = (org.w3c.dom.Element) parameterNodes.item(i);
            Parameter parameter = new Parameter(parameterElement);
            parameters.add(parameter);


        }

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Capability{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", constraints=" + constraints +
                ", parameters=" + parameters +
                '}';
    }
}

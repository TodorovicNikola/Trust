package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class ContractualObligation {
    private String id;
    private String name;
    private List<Constraint> constraints = new ArrayList<>();

    public ContractualObligation(Element capabilityElement) {
        id = capabilityElement.hasAttribute("id") ? capabilityElement.getAttribute("id") : "";
        name = capabilityElement.hasAttribute("name") ? capabilityElement.getAttribute("name") : "";

        NodeList constraintNodes = capabilityElement.getElementsByTagName("constraints");

        for (int i = 0; i < constraintNodes.getLength(); i++) {

            Element constraintElement = (Element) constraintNodes.item(i);
            Constraint constraint = new Constraint(constraintElement);
            constraints.add(constraint);


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

    @Override
    public String toString() {
        return "ContractualObligation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", parameters=" + constraints +
                '}';
    }
}

package com.trust40.col_pro_lan.parser.model;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class ContractualObligation {
	private String id;
	private String name;
	private List<Parameter> parameters = new ArrayList<>();

	public ContractualObligation(Element capabilityElement) {
		id = capabilityElement.hasAttribute("id") ? capabilityElement.getAttribute("id") : "";
		name = capabilityElement.hasAttribute("name") ? capabilityElement.getAttribute("name") : "";

		NodeList parameterNodes = capabilityElement.getElementsByTagName("contractParameters");

		for (int i = 0; i < parameterNodes.getLength(); i++) {

			Element constraintElement = (Element) parameterNodes.item(i);
			Parameter parameter = new Parameter(constraintElement);
			parameters.add(parameter);

		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "ContractualObligation [id=" + id + ", name=" + name + ", parameters=" + parameters + "]";
	}

}

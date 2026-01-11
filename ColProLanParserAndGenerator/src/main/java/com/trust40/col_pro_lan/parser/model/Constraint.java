package com.trust40.col_pro_lan.parser.model;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.trust40.col_pro_lan.parser.impl.IPParser;

public class Constraint {
	private String id;
	private Boolean exposeToCollaboratingParties = false;
	private Boolean isPersisted = false;
	private String physicalDimension; // equivalent to a 'name' attribute?
	private String relationalOperator;
	private Double value;
	private String metricUnit;
	private String persistenceType;
	private Constraint referencedConstraint;
	private String uniqueName;
	private MetricUnit metricUnitObject;

	private String relationalOperatorToStr() {
		String retVal = "";
		if (relationalOperator.contains(">")) {
			retVal += "gt";
		}

		if (relationalOperator.contains("<")) {
			retVal += "lt";
		}

		if (relationalOperator.contains("=")) {
			retVal += "e";
		}
		return retVal;
	}

	public Constraint(Element element) {
		id = element.hasAttribute("id") ? element.getAttribute("id") : "";
		exposeToCollaboratingParties = Boolean.getBoolean(element.hasAttribute("exposeToCollaboratingParties")
				? element.getAttribute("exposeToCollaboratingParties")
				: "false");

		isPersisted = Boolean
				.valueOf(element.hasAttribute("isPersisted") ? element.getAttribute("isPersisted") : "false");
		physicalDimension = element.hasAttribute("propertyName")
				? "C_" + element.getAttribute("propertyName").replace(" ", "_")
				: ""; // mora veliko prvo slovo!
		relationalOperator = element.hasAttribute("relationalOperator")
				? element.getAttribute("relationalOperator").replace("&lt;", "<").replace("&gt;", ">")
				: "";
		relationalOperator = relationalOperator.equals("=") ? "==" : relationalOperator; // da bi se moglo injektovati u
																							// kod
		// samo pocetna vrednost, skaliras kad proveris unit
		double initialValue = element.hasAttribute("value") ? Double.parseDouble(element.getAttribute("value")) : 0.0;

		NodeList unitNodes = element.getElementsByTagName("unit");

		if (unitNodes.getLength() == 1) {
			MetricUnit mu = new MetricUnit((org.w3c.dom.Element) unitNodes.item(0));
			this.value = mu.getIsBase() ? initialValue : initialValue * mu.getScalingFactor();
			this.metricUnit = mu.getBaseUnitName();
			this.metricUnitObject = mu;
		} else {
			this.value = initialValue;
		}

		// 'HASHED' is the default and is therefore not included in the xml file
		persistenceType = element.hasAttribute("persistenceType") ? element.getAttribute("persistenceType") : "HASHED";

		this.referencedConstraint = element.hasAttribute("limitsConstraint")
				? getConstraintForReferencePath(element.getAttribute("limitsConstraint"))
				: null;

		this.uniqueName = this.physicalDimension + "_" + relationalOperatorToStr();

	}

	Constraint getConstraintForReferencePath(String referencePath) {
		String xpathSemiEquvalent = referencePath.replace("//@", "Process/").replace(".", "[").replace("/@", "]/")
				+ "]"; // "Process/elements[8]/inProducts[1]/productPropertyConstraints[3]";

		Pattern pattern = Pattern.compile("\\[(\\d+)\\]");
		Matcher matcher = pattern.matcher(xpathSemiEquvalent);

		StringBuilder sb = new StringBuilder();
		while (matcher.find()) {
			// Parse the number, increment it, and wrap it back in brackets
			int newValue = Integer.parseInt(matcher.group(1)) + 1;
			matcher.appendReplacement(sb, "[" + newValue + "]");
		}
		matcher.appendTail(sb);

		String xpathEquvalent = sb.toString();

		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		Element XMLElement;
		try {
			XMLElement = (Element) xpath.evaluate(xpathEquvalent, IPParser.document, XPathConstants.NODE);
			Constraint referencedConstraint = new Constraint(XMLElement);
			return referencedConstraint;

		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getId() {
		return id;
	}

	public String getPhysicalDimension() {
		return physicalDimension;
	}

	public String getRelationalOperator() {
		return relationalOperator;
	}

	public Double getValue() {
		return value;
	}

	public Boolean getExposeToCollaboratingParties() {
		return exposeToCollaboratingParties;
	}

	public Boolean getPersisted() {
		return isPersisted;
	}

	public String getMetricUnit() {
		return metricUnit;
	}

	public String getPersistenceType() {
		return persistenceType;
	}

	public Constraint getReferencedConstraint() {
		return referencedConstraint;
	}

	public String getUniqueName() {
		return uniqueName;
	}

	public MetricUnit getMetricUnitObject() {
		return metricUnitObject;
	}

	@Override
	public String toString() {
		return "Constraint [id=" + id + ", exposeToCollaboratingParties=" + exposeToCollaboratingParties
				+ ", isPersisted=" + isPersisted + ", physicalDimension=" + physicalDimension + ", relationalOperator="
				+ relationalOperator + ", value=" + value + ", metricUnit=" + metricUnit + ", persistenceType="
				+ persistenceType + ", referencedConstraint=" + referencedConstraint + "]";
	}

}

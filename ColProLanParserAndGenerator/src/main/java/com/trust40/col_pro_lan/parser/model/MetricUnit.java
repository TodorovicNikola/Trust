package com.trust40.col_pro_lan.parser.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MetricUnit {
	private String name;
	private String symbol;
	private Boolean isBase;
	private Double scalingFactor;
	private String baseUnitName;
	private String dimensionName;
	private String dimensionSymbol;
	private Double smallestFragment;

	public MetricUnit(Element element) {

		String href = element.getAttribute("href");
		NodeList dimensionNodes = getDimensionNodeListForSystemOfUnits(href.split("\\.")[0]);

		String[] hrefClassParts = href.split("@");
		int chosenDimensionPosition = Integer.parseInt(hrefClassParts[1].split("\\.")[1].replace("/", ""));
		int chosenUnitPosition = Integer.parseInt(hrefClassParts[2].split("\\.")[1].replace("/", ""));

		Element dimension = (org.w3c.dom.Element) dimensionNodes.item(chosenDimensionPosition);
		NodeList unitNodes = dimension.getElementsByTagName("units");

		Element chosenUnit = (org.w3c.dom.Element) unitNodes.item(chosenUnitPosition);
		this.isBase = chosenUnit.hasAttribute("is_base") ? Boolean.valueOf(chosenUnit.getAttribute("is_base")) : false;
		if (this.isBase) {
			this.baseUnitName = this.name;
		}

		this.name = chosenUnit.getAttribute("name");
		this.scalingFactor = Double.parseDouble(chosenUnit.getAttribute("scaling_factor"));
		this.symbol = chosenUnit.getAttribute("symbol");

		Boolean baseUnitFound = this.isBase;
		Double smallestFragmentFound = 1.0;
		for (int i = 0; i < unitNodes.getLength(); i++) {
			Element unit = (org.w3c.dom.Element) unitNodes.item(i);

			if (!baseUnitFound) {
				Boolean isCurrentUnitBase = unit.hasAttribute("is_base") ? Boolean.valueOf(unit.getAttribute("is_base"))
						: false;

				if (isCurrentUnitBase) {
					this.baseUnitName = unit.getAttribute("name");
				}
			}

			Double unitScallingFactor = Double.parseDouble(chosenUnit.getAttribute("scaling_factor"));
			if (unitScallingFactor < smallestFragmentFound) {
				smallestFragmentFound = unitScallingFactor;
			}

		}
		this.smallestFragment = smallestFragmentFound;

	}

	public NodeList getDimensionNodeListForSystemOfUnits(String systemOfUnits) {
		String metricSystemFilePath = "src/main/resources/source/Metric.process_modeling";
		String relevantFilePath = null;
		switch (systemOfUnits) {
		case "Metric":
			relevantFilePath = metricSystemFilePath;
			break;

		default:
			throw new IllegalArgumentException("Type system file cannot be openned!");
		}

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(new File(relevantFilePath));
			document.getDocumentElement().normalize();

			XPathFactory xpathFactory = XPathFactory.newInstance();
			XPath xpath = xpathFactory.newXPath();
			NodeList dimensionNodes = (NodeList) xpath.evaluate("SystemOfUnits/dimensions", document,
					XPathConstants.NODESET);
			return dimensionNodes;
		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Type system file cannot be openned!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Boolean getIsBase() {
		return isBase;
	}

	public void setIsBase(Boolean isBase) {
		this.isBase = isBase;
	}

	public Double getScalingFactor() {
		return scalingFactor;
	}

	public void setScalingFactor(Double scalingFactor) {
		this.scalingFactor = scalingFactor;
	}

	public String getBaseUnitName() {
		return baseUnitName;
	}

	public void setBaseUnitName(String baseUnitName) {
		this.baseUnitName = baseUnitName;
	}

	public String getDimensionName() {
		return dimensionName;
	}

	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName;
	}

	public String getDimensionSymbol() {
		return dimensionSymbol;
	}

	public void setDimensionSymbol(String dimensionSymbol) {
		this.dimensionSymbol = dimensionSymbol;
	}

	public Double getSmallestFragment() {
		return smallestFragment;
	}

	public void setSmallestFragment(Double smallestFragment) {
		this.smallestFragment = smallestFragment;
	}

	@Override
	public String toString() {
		return "MetricUnit [name=" + name + ", symbol=" + symbol + ", isBase=" + isBase + ", scalingFactor="
				+ scalingFactor + ", baseUnitName=" + baseUnitName + ", dimensionName=" + dimensionName
				+ ", dimensionSymbol=" + dimensionSymbol + "]";
	}

}

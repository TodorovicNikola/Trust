package com.trust40.multi_pro_lan.parser.impl;

import com.trust40.multi_pro_lan.parser.AbstractParser;
import com.trust40.multi_pro_lan.parser.model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.util.*;

public class CBPParser extends AbstractParser {

    public Map<String, Object> generateValueMapForModel(String path) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
        selectedElements = new HashMap<>();
        parseModel(path);
        printSelectedElements();
        return generateValueMap();
    }

    public Pool parsePool(String path) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        Pool pool = new Pool();
        Document document = prepareDocument(path);
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();
        NodeList XMLElements = (NodeList) xpath.evaluate("Process/elements", document,
                XPathConstants.NODESET);

        for (int i = 0; i < XMLElements.getLength(); i++) {
            Node node = XMLElements.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) node;

                if(element.getAttribute("xsi:type").equals("mod:Pool")) {
                    String id = element.getAttribute("id");
                    String name = element.getAttribute("name");
                    String endorsementPolicy = element.getAttribute("endorsementPolicy");

                    pool = new Pool(id, name, endorsementPolicy);

                    NodeList swimlanesNodes = element.getChildNodes();

                    for (int j = 0; j < swimlanesNodes.getLength(); j++) {
                            Node swimlane = swimlanesNodes.item(j);
                        if (swimlane.getNodeType() == Node.ELEMENT_NODE) {
                            Element swimlaneElement = (Element) swimlane;
                            Swimlanes swimlanes = new Swimlanes(swimlaneElement);
                            pool.addSwimlanes(swimlanes);
                        }
                    }
                }
            }
        }

        return pool;
    }


    protected Map<String, ProcessElement> extractProcessElements(Document document) throws XPathExpressionException {
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();
        NodeList XMLElements = (NodeList) xpath.evaluate("Process/elements/swimlanes/elements", document,
                XPathConstants.NODESET);

        Map<String, ProcessElement> elementMap = new HashMap<>();

        for (int i = 0; i < XMLElements.getLength(); i++) {
            org.w3c.dom.Node node = XMLElements.item(i);
            if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                org.w3c.dom.Element element = (org.w3c.dom.Element) node;
                org.w3c.dom.Element swimlaneElement = (org.w3c.dom.Element) element.getParentNode();
                String elementType = element.getAttribute("xsi:type");

                switch (elementType) {
                    case "mod:ProcessStep": {
                        ProcessStep processStep = new ProcessStep(element, swimlaneElement);
                        elementMap.put(processStep.getId(), processStep);

                        break;
                    }
                    case "mod:Gate": {
                        Gate gate = new Gate(element, swimlaneElement);
                        elementMap.put(gate.getId(), gate);
                    }
                }
            }
        }

        return elementMap;
    }


    protected Map<String, Object> generateValueMap() {
        Map<String, Object> valueMap = new HashMap<>();

        Map<String, IDNamedElement> relevantElements = extractRelevantElements();
        Set<String> relevantElementKeySet = relevantElements.keySet();

        Map<String, String> elementUniqueNameMap = new HashMap<>();
        Map<String, List<String>> previousElementIdsMap = new HashMap<>();
        Map<String, List<String>> nextElementIdsMap = new HashMap<>();
        Map<String, String> elementTypeMap = new HashMap<>();
        Map<String, Capability> capabilityMap = new HashMap<>();
        Map<String, List<Product>> inputProductsMap = new HashMap<>();

        for (String id : relevantElementKeySet) {
            elementUniqueNameMap.put(id, relevantElements.get(id).getUniqueName());
            previousElementIdsMap.put(id, new ArrayList<>(relevantElements.get(id).getPreviousElements().keySet()));
            nextElementIdsMap.put(id, new ArrayList<>(relevantElements.get(id).getFollowingElements().keySet()));
            elementTypeMap.put(id, relevantElements.get(id).getClass().asSubclass(IDNamedElement.class).getSimpleName());


            if (relevantElements.get(id) instanceof ProcessStep) {
                capabilityMap.put(id, ((ProcessStep) relevantElements.get(id)).getCapability());
                inputProductsMap.put(id, ((ProcessStep) relevantElements.get(id)).getInputProducts());
            }


            if (relevantElements.get(id).getName().toLowerCase().equalsIgnoreCase("start")) {
                valueMap.put("startElementUniqueName", relevantElements.get(id).getUniqueName());
            }

        }

        valueMap.put("elementIds", new ArrayList<>(relevantElementKeySet));
        valueMap.put("elementUniqueNameMap", elementUniqueNameMap);
        valueMap.put("previousElementIdsMap", previousElementIdsMap);
        valueMap.put("nextElementIdsMap", nextElementIdsMap);
        valueMap.put("elementTypeMap", elementTypeMap);
        valueMap.put("capabilityMap", capabilityMap);
        valueMap.put("inputProductsMap", inputProductsMap);

        return valueMap;
    }

    private Map<String, IDNamedElement> extractRelevantElements() {
        Map<String, IDNamedElement> relevantElements = new HashMap<>();

        for (String key : selectedElements.keySet()) {
            IDNamedElement element = selectedElements.get(key);
            if (!(element instanceof Gate && ((element.getType().equalsIgnoreCase("DECISION")) || (((Gate) element).getType().equalsIgnoreCase("DECISION") && ((Gate) element).getOutgoingRelationship().size() > 1)))) {  //flowElement instanceof Task || flowElement instanceof SequenceFlow || (flowElement instanceof ParallelGateway && ((ParallelGateway) flowElement).getIncoming().size() > 1)) {
                relevantElements.put(key, selectedElements.get(key)); // uvek je u pitanju processElement, zato moze parsiranje
            }
        }

        return relevantElements;
    }

}

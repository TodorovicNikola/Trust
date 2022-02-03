package com.trust40.multi_pro_lan.parser;

import com.trust40.multi_pro_lan.parser.model.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractParser {

    protected Map<String, IDNamedElement> selectedElements;

    protected Document prepareDocument(String path) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File(path));
        document.getDocumentElement().normalize();
        return document;
    }

    protected void parseModel(String path) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        Document document = prepareDocument(path);

        Map<String, ProcessElement> extractedNodes = extractProcessElements(document);
        List<Relationship> relationships = extractRelationships(document);

        for (Relationship relationship : relationships) {
            ProcessElement source = extractedNodes.get(relationship.getSourceId());
            ProcessElement target = extractedNodes.get(relationship.getTargetId());

            if (source == null || target == null) {
                continue;
            }

            relationship.setSource(source);
            relationship.setTarget(target);

            source.getOutgoingRelationship().add(relationship);
            target.getIncomingRelationship().add(relationship);
        }

        for (String id : extractedNodes.keySet()) {
            ProcessElement processElement = extractedNodes.get(id);

            selectElement(processElement);

            selectFollowingElements(processElement, processElement.getFollowingElements());
            selectPreviousElements(processElement, processElement.getPreviousElements());

        }
    }

    protected void selectFollowingElements(ProcessElement processElement, Map<String, IDNamedElement> followingElements) {
        for (Relationship relationship : processElement.getOutgoingRelationship()) {
            if (relationship.getTarget() instanceof ProcessStep) {
                ProcessElement followingProcessElement = relationship.getTarget();
                followingElements.put(followingProcessElement.getId(), selectElement(followingProcessElement));

            } else if ((relationship.getTarget() instanceof Gate && ((Gate) relationship.getTarget()).getType().equalsIgnoreCase("PARALLELISM")) && (relationship.getTarget().getIncomingRelationship().size() > 1)) {
                followingElements.put(((IDNamedElement) relationship).getId(), selectElement(relationship));

                // TODO: Treba videti kako obraditi collaboration gate... (3.8.2021)
            } else if ((relationship.getTarget() instanceof Gate || (relationship.getTarget() instanceof Gate && relationship.getTarget().getType().equalsIgnoreCase("DECISION") && (relationship.getTarget()).getIncomingRelationship().size() > 1))) {
                selectFollowingElements(relationship.getTarget(), followingElements);
            }
        }
    }

    protected void selectPreviousElements(ProcessElement processElement, Map<String, IDNamedElement> previousElements) {
        previousElements.put(processElement.getId(), processElement);

        if (processElement instanceof ProcessStep) {
            for (Relationship relationship : (processElement.getIncomingRelationship())) {
                ProcessElement sourceNode = relationship.getSource(); // node, a ne element, jer ne moze biti relationship u pitanju

                if (((sourceNode instanceof Gate) && sourceNode.getType().equalsIgnoreCase("DECISION")) && (sourceNode.getOutgoingRelationship().size() > 1)) {
                    selectFollowingElements(relationship.getSource(), previousElements);
                }
            }
        } else if ((processElement instanceof Gate && ((Gate) processElement).getType().equalsIgnoreCase("PARALLELISM")) && (processElement.getIncomingRelationship().size() > 1)) {
//            // TODO: moj dodatak algoritmu! parallel gateway nije potreban sebi u svojim prethodnim. (revision - mozda? :D treba videti...)
//            //  On treba da deaktivira ulazne ivice, sam zapravo nikad nije aktivan (NISU POTREBNA STATUSNA POLJA, IAKO U ALGORITMU STOJI DA JESU)!
            previousElements.remove(processElement.getId());

            for (Relationship relationship : processElement.getIncomingRelationship()) {
                IDNamedElement previousProcessElement = selectElement(relationship);
                previousProcessElement.getFollowingElements().put(processElement.getId(), processElement); // u following od veze ubacuje gate

                previousElements.put(relationship.getId(), previousProcessElement); // u previous od gate ubacuje veze
            }
        }
    }

    protected List<Relationship> extractRelationships(Document document) {
        List<Relationship> relationships = new ArrayList<>();

        NodeList XMLRelationships = document.getElementsByTagName("relationships");
        for (int i = 0; i < XMLRelationships.getLength(); i++) {
            org.w3c.dom.Node node = XMLRelationships.item(i);

            if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                org.w3c.dom.Element element = (org.w3c.dom.Element) node;
                relationships.add(new Relationship(element));
            }
        }
        return relationships;
    }

    protected IDNamedElement selectElement(IDNamedElement processElement) {
        if (selectedElements.containsKey(processElement.getId())) {
            return processElement;
        }

        selectedElements.put(processElement.getId(), processElement);
        return processElement;
    }

    protected void printSelectedElements() {
        for (String id : selectedElements.keySet()) {
            IDNamedElement processElement = selectedElements.get(id);

            System.out.println("-----------------------------------------------------");
            System.out.println(processElement);
            System.out.println("Previous elements: " + processElement.getPreviousElements());
            System.out.println("Next elements: " + processElement.getFollowingElements());
            System.out.println("-----------------------------------------------------");
        }
    }

    protected abstract Map<String, ProcessElement> extractProcessElements(Document document) throws XPathExpressionException;

    protected abstract Map<String, Object> generateValueMapForModel(String path) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException;

    protected abstract Map<String, Object> generateValueMap();
}

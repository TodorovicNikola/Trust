package com.trust40.col_pro_lan.parser;

import org.junit.Test;
import org.w3c.dom.Document;

import com.trust40.col_pro_lan.parser.impl.IPParser;
import com.trust40.col_pro_lan.parser.model.IDNamedElement;
import com.trust40.col_pro_lan.parser.model.ProcessElement;
import com.trust40.col_pro_lan.parser.model.ProcessStep;
import com.trust40.col_pro_lan.parser.model.Relationship;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AbstractParserTestParseModel {

	@Spy
	private IPParser ipParser;

	private Map<String, ProcessElement> mockNodes;
	private List<Relationship> mockRelationships;

	@Before
	public void setUp() {
		mockNodes = new HashMap<>();
		mockRelationships = new ArrayList<>();
	}

	private Document createDocument(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(new ByteArrayInputStream(xml.getBytes()));
	}
	
	@Test
	public void testParseModel_SuccessfulLinkage() throws Exception {
		// Arrange: Create a source, a target, and a relationship connecting them
		String xml = "<mod:Process xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:mod=\"http://www.trust40.com/process-modeling\" startStep=\"//@elements.0\">\r\n" 
				+ "  <elements xsi:type=\"mod:ProcessStep\" id=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5\" name=\"Start\" exposeToCollaboratingParties=\"true\" isTraced=\"true\" outRelationships=\"//@relationships.0\" type=\"START\"/>\r\n"
				+ "  <elements xsi:type=\"mod:Gate\" id=\"036d41c3-15b9-4ab0-a1a5-2b9893463336\" name=\"Parallelism\" exposeToCollaboratingParties=\"true\" inRelationships=\"//@relationships.0\" outRelationships=\"//@relationships.1 //@relationships.2\" type=\"PARALLELISM\"/>\r\n"
				+ "<relationships id=\"14afd7b3-4d4c-4e05-a6ce-319192afc33f\" name=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5_036d41c3-15b9-4ab0-a1a5-2b9893463336_flow\" source=\"//@elements.0\" target=\"//@elements.1\"/>\r\n" 
				+ "</mod:Process>";
		
		Document doc = createDocument(xml);
		IPParser service = new IPParser();
		List<Relationship> relationships = service.extractRelationships(doc);
    	
        // Arrange
        Relationship rel = relationships.get(0);
		
		Map<String, ProcessElement> extractedNodes = ipParser.extractProcessElements(doc);

		ProcessElement source = extractedNodes.get("14aec0a0-a112-452e-9bb2-6cb91fddd7d5");
		ProcessElement target = extractedNodes.get("036d41c3-15b9-4ab0-a1a5-2b9893463336");
		
		mockNodes.put("14aec0a0-a112-452e-9bb2-6cb91fddd7d5", source);
		mockNodes.put("036d41c3-15b9-4ab0-a1a5-2b9893463336", target);
		mockRelationships.add(rel);

		// Mock internal calls to isolate the parseModel logic
		doReturn(doc).when(ipParser).prepareDocument(anyString());
		doReturn(mockNodes).when(ipParser).extractProcessElements(any());
		doReturn(mockRelationships).when(ipParser).extractRelationships(any());

		// Mock the selection methods to avoid NullPointerExceptions
		doNothing().when(ipParser).selectFollowingElements(any(), any());
		doNothing().when(ipParser).selectPreviousElements(any(), any());

		// Act
		ipParser.parseModel("fake/path.xml");

		// Assert: Check if pointers were correctly set
		assertEquals(source, rel.getSource());
		assertEquals(target, rel.getTarget());
		assertTrue(source.getOutgoingRelationship().contains(rel));
		assertTrue(target.getIncomingRelationship().contains(rel));

		// Verify selection logic was triggered
		verify(ipParser).selectElement(source);
	}

}
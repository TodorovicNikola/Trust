package com.trust40.col_pro_lan.parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;

import com.trust40.col_pro_lan.parser.impl.IPParser;
import com.trust40.col_pro_lan.parser.model.Gate;
import com.trust40.col_pro_lan.parser.model.ProcessElement;
import com.trust40.col_pro_lan.parser.model.ProcessStep;

public class IPParserTest {

    private IPParser service; // Replace with your actual class name

    @Before
    public void setUp() {
        service = new IPParser();
    }

    /**
     * Helper to create a W3C Document from a String.
     * This is cleaner than mocking the entire NodeList/Node hierarchy.
     */
    private Document createTestDocument(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(new ByteArrayInputStream(xml.getBytes()));
    }

    @Test
    public void testExtractProcessElements_Success() throws Exception {
        // Prepare XML that matches your XPath "Process/elements"
        // and has the required xsi:type attributes
		String xml = "<mod:Process xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:mod=\"http://www.trust40.com/process-modeling\" startStep=\"//@elements.0\">\r\n" 
				+ "  <elements xsi:type=\"mod:ProcessStep\" id=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5\" name=\"Start\" exposeToCollaboratingParties=\"true\" isTraced=\"true\" outRelationships=\"//@relationships.0\" type=\"START\"/>\r\n"
				+ "  <elements xsi:type=\"mod:Gate\" id=\"036d41c3-15b9-4ab0-a1a5-2b9893463336\" name=\"Parallelism\" exposeToCollaboratingParties=\"true\" isTraced=\"true\" inRelationships=\"//@relationships.0\" outRelationships=\"//@relationships.1 //@relationships.2\" type=\"PARALLELISM\"/>\r\n"
				+ "<relationships id=\"14afd7b3-4d4c-4e05-a6ce-319192afc33f\" name=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5_036d41c3-15b9-4ab0-a1a5-2b9893463336_flow\" source=\"//@elements.0\" target=\"//@elements.1\"/>\r\n" 
				+ "</mod:Process>";

        Document doc = createTestDocument(xml);

        // Execute
        Map<String, ProcessElement> result = service.extractProcessElements(doc);

        // Verify counts
        assertEquals("Should have extracted 2 elements", 2, result.size());
        
        // Verify types (assuming your ProcessStep/Gate classes store the ID)
        assertTrue(result.get("step1") instanceof ProcessStep);
        assertTrue(result.get("gate1") instanceof Gate);
    }

    @Test
    public void testExtractProcessElements_EmptyDocument() throws Exception {
        String xml = "<Process></Process>";
        Document doc = createTestDocument(xml);

        Map<String, ProcessElement> result = service.extractProcessElements(doc);

        assertTrue("Map should be empty", result.isEmpty());
    }

    @Test(expected = XPathExpressionException.class)
    public void testExtractProcessElements_NullDocument() throws XPathExpressionException {
        // Passing null usually triggers an exception in XPath.evaluate
        service.extractProcessElements(null);
    }
}
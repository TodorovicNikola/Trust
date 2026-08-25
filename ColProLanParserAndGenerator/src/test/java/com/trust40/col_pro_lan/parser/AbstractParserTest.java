package com.trust40.col_pro_lan.parser;

import org.junit.Test;
import org.w3c.dom.Document;

import com.trust40.col_pro_lan.parser.impl.IPParser;
import com.trust40.col_pro_lan.parser.model.IDNamedElement;
import com.trust40.col_pro_lan.parser.model.ProcessStep;
import com.trust40.col_pro_lan.parser.model.Relationship;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class AbstractParserTest {

	// Helper method to create a Document from a String
	private Document createDocument(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(new ByteArrayInputStream(xml.getBytes()));
	}

	@Test
	public void shouldExtractMultipleRelationships() throws Exception {
		// Arrange
		String xml = "<mod:Process xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:mod=\"http://www.trust40.com/process-modeling\" startStep=\"//@elements.0\">\r\n" 
				+ "<relationships id=\"14afd7b3-4d4c-4e05-a6ce-319192afc33f\" name=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5_036d41c3-15b9-4ab0-a1a5-2b9893463336_flow\" source=\"//@elements.0\" target=\"//@elements.1\"/>\r\n" + 
				"  <relationships id=\"5a304c14-a21b-474f-ae3f-90df0bd9971c\" name=\"036d41c3-15b9-4ab0-a1a5-2b9893463336_25517609-b073-4626-84ff-797fa387f62b_flow\" source=\"//@elements.1\" target=\"//@elements.2\"/>" + "</mod:Process>";
		
		Document doc = createDocument(xml);
		IPParser service = new IPParser();

		// Act
		List<Relationship> result = service.extractRelationships(doc);

		// Assert
		assertEquals(2, result.size());
	}

	@Test
	public void shouldReturnEmptyListWhenNoRelationshipsExist() throws Exception {
		// Arrange
		String xml = "<root><otherNode>No relationships here</otherNode></root>";
		Document doc = createDocument(xml);
		IPParser service = new IPParser();

		// Act
		List<Relationship> result = service.extractRelationships(doc);

		// Assert
		assertTrue(result.isEmpty());
	}
	
	@Test
    public void shouldAddElementToMapWhenNotPresent() throws Exception {
		String xml = "<mod:Process xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:mod=\"http://www.trust40.com/process-modeling\" startStep=\"//@elements.0\">\r\n" 
				+ "<relationships id=\"14afd7b3-4d4c-4e05-a6ce-319192afc33f\" name=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5_036d41c3-15b9-4ab0-a1a5-2b9893463336_flow\" source=\"//@elements.0\" target=\"//@elements.1\"/>\r\n" + 
				"  <relationships id=\"5a304c14-a21b-474f-ae3f-90df0bd9971c\" name=\"036d41c3-15b9-4ab0-a1a5-2b9893463336_25517609-b073-4626-84ff-797fa387f62b_flow\" source=\"//@elements.1\" target=\"//@elements.2\"/>" + "</mod:Process>";
		
		Document doc = createDocument(xml);
		IPParser service = new IPParser();
		List<Relationship> relationships = service.extractRelationships(doc);

        // Act
        IDNamedElement result = service.selectElement(relationships.get(0));

        // Assert
        assertNotNull("Result should not be null", result);
        assertEquals("Should return the same element", relationships.get(0).getId(), result.getId());
        
        // Indirectly verify it was added by calling it again
        // Or if 'selectedElements' is accessible, check its size
    }

    @Test
    public void shouldReturnElementWhenAlreadyPresent() throws Exception {
		String xml = "<mod:Process xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:mod=\"http://www.trust40.com/process-modeling\" startStep=\"//@elements.0\">\r\n" 
				+ "<relationships id=\"14afd7b3-4d4c-4e05-a6ce-319192afc33f\" name=\"14aec0a0-a112-452e-9bb2-6cb91fddd7d5_036d41c3-15b9-4ab0-a1a5-2b9893463336_flow\" source=\"//@elements.0\" target=\"//@elements.1\"/>\r\n" + 
				"  <relationships id=\"5a304c14-a21b-474f-ae3f-90df0bd9971c\" name=\"036d41c3-15b9-4ab0-a1a5-2b9893463336_25517609-b073-4626-84ff-797fa387f62b_flow\" source=\"//@elements.1\" target=\"//@elements.2\"/>" + "</mod:Process>";
		
		Document doc = createDocument(xml);
		IPParser service = new IPParser();
		List<Relationship> relationships = service.extractRelationships(doc);
    	
        // Arrange
        IDNamedElement element = relationships.get(0);
        service.selectElement(element); // First call to put it in the map

        // Act
        IDNamedElement result = service.selectElement(element); // Second call

        // Assert
        assertEquals("Should return the element already in the map", element, result);
    }

}

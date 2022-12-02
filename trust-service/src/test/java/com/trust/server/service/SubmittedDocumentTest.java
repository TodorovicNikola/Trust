package com.trust.server.service;

import com.trust.server.Fixtures;
import com.trust.service.service.SubmittedDocumentService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Base64;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertFalse;

public class SubmittedDocumentTest {

    @Test
    public void testEncryptingWholeDocument() {
        String xml = null;
        String expected = null;
        try {
            xml = Fixtures.xmlInput();
            expected = Fixtures.xmlOutput();
        } catch (IOException e) {
            assertFalse("Failed loading the file.", true);
        }
        xml = Base64.getEncoder().encodeToString(xml.getBytes());
        SubmittedDocumentService.removeElementsPrivateToOrg(xml);
        xml = new String(Base64.getDecoder().decode(xml.getBytes()));
        assertEquals("XMLs", expected, xml);
    }
}

package com.trust.server.service;

import com.trust.server.Fixtures;
import com.trust.service.service.XMLSigningService;
import com.trust.service.util.XMLUtils;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertFalse;

public class SigningServiceTest {

    @Test
    public void testEncryptingWholeDocument() {
        String xml = null;
        try {
            xml = Fixtures.xmlInput();
        } catch (IOException e) {
            assertFalse("Failed loading the file.", true);
        }

        XMLSigningService xmlSigningService = new XMLSigningService();
        xmlSigningService.signDocument(xml);

        String actual = null;
        try {
            actual = Fixtures.signedXMLWithoutSignature();
        } catch (IOException e) {
            assertFalse("Failed loading the file.", true);
        }
        assertEquals("XMLs", xml, actual);
    }

    @Test
    public void testCombiningSignatureAndDocument() {
        String actual = null;
        String xml = null;
        String sig = null;
        try {
            actual = Fixtures.xmlDocumentWithSignature();
            xml = Fixtures.xmlInput();
            sig = Fixtures.xmlSignaure();
        } catch (IOException e) {
            assertFalse("Failed loading the file.", true);
        }
        Document document = XMLUtils.getDocumentFromXML(xml);
        Document signatureDocument = XMLUtils.getDocumentFromXML(sig);

        XMLSigningService signingService = new XMLSigningService();
        Document combined = signingService.combineDocumentAndSignature(document, signatureDocument);
        String combinedString = XMLUtils.getXMLFromDocument(combined);

        assertEquals("XMLs", actual, combinedString);
    }

    @Test
    public void testVerifyDetachedSignature() {
        String doc = null;
        String sig = null;
        try {
            doc = Fixtures.xmlInput();
            sig = Fixtures.xmlSignaure();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Document document = XMLUtils.getDocumentFromXML(doc);
        Document signature = XMLUtils.getDocumentFromXML(sig);

        XMLSigningService signingService = new XMLSigningService();
        Document combined = signingService.combineDocumentAndSignature(document, signature);

        boolean expected = true;
        boolean actual = signingService.verifySignature(combined);

        assertEquals("Verifying detached signature failed: ", expected, actual);
    }
}

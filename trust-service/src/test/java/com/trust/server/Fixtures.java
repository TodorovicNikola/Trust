package com.trust.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fixtures {

    public static String loadFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static String xmlInput() throws IOException {
        return loadFile("test-document.xml");
    }

    public static String signedXMLWithoutSignature() throws IOException {
        return loadFile("test-signed-without-signature.xml");
    }

    public static String xmlDocumentWithSignature() throws IOException {
        return loadFile("test-document-with-signature.xml");
    }

    public static String xmlSignaure() throws IOException {
        return loadFile("test-signature.xml");
    }
}

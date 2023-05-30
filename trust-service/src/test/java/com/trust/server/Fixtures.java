package com.trust.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fixtures {

    public static String loadFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static String xmlInput() throws IOException {
        return loadFile("src/test/java/com/trust/server/data/test-document.xml");
    }

    public static String signedXMLWithoutSignature() throws IOException {
        return loadFile("src/test/java/com/trust/server/data/test-signed-without-signature.xml");
    }

    public static String xmlDocumentWithSignature() throws IOException {
        return loadFile("src/test/java/com/trust/server/data/test-document-with-signature.xml");
    }

    public static String xmlSignature() throws IOException {
        return loadFile("src/test/java/com/trust/server/data/test-signature.xml");
    }
}

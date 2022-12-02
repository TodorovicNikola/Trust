package com.trust.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fixtures {

    public static String xmlInput() throws IOException {
        return new String(Files.readAllBytes(Paths.get("test.xml")));
    }

    public static String xmlOutput() throws IOException {
        return new String(Files.readAllBytes(Paths.get("output.xml")));
    }

    public static String loadFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}

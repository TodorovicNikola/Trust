package com.trust.dltagen.model;

public class Orderer {
    private String id;
    private String name;
    private String domain;
    private String secret;
    private String host;
    private int port;
    private int adminPort;
    private int operationsPort;
    CertificateAuthority certificateAuthority;
}

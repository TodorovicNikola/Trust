package com.trust.dltagen.model;

import java.util.List;

public class Organization {
    private String id;
    private String name;
    private String domain;
    private String host;
    private String mspId;
    private String adminName;
    private String adminSecret;
    List<Peer> peers;
    List<Client> clients;
    CertificateAuthority certificateAuthority;
}

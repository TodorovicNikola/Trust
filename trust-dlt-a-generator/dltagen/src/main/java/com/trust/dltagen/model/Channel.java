package com.trust.dltagen.model;

import java.util.List;

public class Channel {
    private String id;
    private String name;
    Orderer orderer;
    List<Peer> peers;
}

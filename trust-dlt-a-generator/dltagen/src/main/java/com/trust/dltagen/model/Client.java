package com.trust.dltagen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    private Long id;
    private String name;
    private String secret;

    public Client() {

    }

    public Client(Long id, String name, String secret) {
        this.id = id;
        this.name = name;
        this.secret = secret;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecret() {
        return secret;
    }
}

package com.trust40.multi_pro_lan.parser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pool {
    private String id;
    private String name;
    private String endorsementPolicy;
    private List<Swimlanes> swimlanes = new ArrayList<>();

    public Pool() {}

    public Pool(String id, String name, String endorsementPolicy) {
        this.id = id;
        this.name = name;
        this.endorsementPolicy = endorsementPolicy;
    }

    public void addSwimlanes(Swimlanes swimlane) {
        swimlanes.add(swimlane);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pool pool = (Pool) o;
        return Objects.equals(id, pool.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEndorsementPolicy() {
        return endorsementPolicy;
    }

    public List<Swimlanes> getSwimlanes() {
        return swimlanes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = " + id +
                "\nname = " + name +
                "\nendorsementPolicy = " + endorsementPolicy +
                "\nswimlanes:\n");
        for(Swimlanes sl: swimlanes) {
            sb.append(sl);
        }
        return sb.toString();
    }
}

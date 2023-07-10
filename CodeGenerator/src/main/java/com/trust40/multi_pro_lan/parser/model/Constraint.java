package com.trust40.multi_pro_lan.parser.model;


import org.w3c.dom.Element;

public class Constraint {
    private String id;
    private Boolean exposeToCollaboratingParties = false;
    private Boolean isPersisted = false;
    private String physicalDimension; // equivalent to a 'name' attribute?
    private String relationalOperator;
    private String value;
    private String metricUnit;
    private String persistenceType;

    public Constraint(Element element) {
        id = element.hasAttribute("id") ? element.getAttribute("id") : "";
        exposeToCollaboratingParties = Boolean.getBoolean(element.hasAttribute("exposeToCollaboratingParties") ? element.getAttribute("exposeToCollaboratingParties") : "false");

        isPersisted = Boolean.valueOf(element.hasAttribute("isPersisted") ? element.getAttribute("isPersisted") : "false");
        physicalDimension = element.hasAttribute("physicalDimension") ? "C_" + element.getAttribute("physicalDimension").replace(" ", "_") : ""; // mora veliko prvo slovo!
        relationalOperator = element.hasAttribute("relationalOperator") ? element.getAttribute("relationalOperator").replace("&lt;", "<").replace("&gt;", ">") : "";
        relationalOperator = relationalOperator.equals("=") ? "==" :  relationalOperator; // da bi se moglo injektovati u kod
        value = element.hasAttribute("value") ? element.getAttribute("value") : "";
        metricUnit = element.hasAttribute("metricUnit") ? element.getAttribute("metricUnit") : "";
        persistenceType = element.hasAttribute("persistenceType") ? element.getAttribute("persistenceType") : "HASHED"; // 'HASHED is the default - hence, it is note included in the xml file'

    }

    public String getId() {
        return id;
    }

    public String getPhysicalDimension() {
        return physicalDimension;
    }

    public String getRelationalOperator() {
        return relationalOperator;
    }

    public String getValue() {
        return value;
    }

    public Boolean getExposeToCollaboratingParties() {
        return exposeToCollaboratingParties;
    }

    public Boolean getPersisted() {
        return isPersisted;
    }

    public String getMetricUnit() {
        return metricUnit;
    }

    public String getPersistenceType() {
        return persistenceType;
    }

    @Override
    public String toString() {
        return "Constraint{" +
                "id='" + id + '\'' +
                ", exposeToCollaboratingParties=" + exposeToCollaboratingParties +
                ", isPersisted=" + isPersisted +
                ", physicalDimension='" + physicalDimension + '\'' +
                ", relationalOperator='" + relationalOperator + '\'' +
                ", value='" + value + '\'' +
                ", metricUnit='" + metricUnit + '\'' +
                ", persistenceType='" + persistenceType + '\'' +
                '}';
    }
}

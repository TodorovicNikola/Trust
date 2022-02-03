package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

public class Product {
    private String id;
    private String name;
    private String uniqueName;
    private int quantity;

    public Product(Element productElement) {
        id = productElement.getAttribute("id");
        name = productElement.getAttribute("name").replace(" ", "");
        uniqueName = "IP_" + name.substring(0, Math.min(name.length(), 22)) + "_" + id.substring(0, 4);
        quantity = Integer.parseInt(productElement.getAttribute("quantity"));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

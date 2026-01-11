package com.trust40.col_pro_lan.parser.model;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Product {
    private String id;
    private String name;
    private String uniqueName;
    private int quantity;
    private List<Constraint> constraints = new ArrayList<>();

    public Product(Element productElement) {
        id = productElement.getAttribute("id");
        name = productElement.getAttribute("name").replace(" ", "");
        uniqueName = "IP_" + name.substring(0, Math.min(name.length(), 22)) + "_" + id.substring(0, 4);
        quantity = Integer.parseInt(productElement.getAttribute("quantity"));
        
        NodeList constraintNodes = productElement.getElementsByTagName("productPropertyConstraints");

        for (int i = 0; i < constraintNodes.getLength(); i++) {

            Element constraintElement = (org.w3c.dom.Element) constraintNodes.item(i);
            Constraint constraint = new Constraint(constraintElement);
            if (constraint.getPersisted()) { // adding only constraints about which data is expected to be persisted; the rest are not needed for now (if you update this, you need to update freemarker templates as well)
                constraints.add(constraint);

            }
        }
        
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniqueName() {
		return uniqueName;
	}

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Constraint> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", uniqueName=" + uniqueName + ", quantity=" + quantity
				+ ", constraints=" + constraints + "]";
	}

}

package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

public class Parameter extends IDNamedElement {
    private String key;
    private String value;

    protected Parameter(Element namedElement) {
        super(namedElement);
        key = namedElement.getAttribute("key");
        value = namedElement.getAttribute("value");
    }

    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

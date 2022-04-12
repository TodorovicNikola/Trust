package com.trust40.multi_pro_lan.parser.model;

import org.w3c.dom.Element;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class IDNamedElement {
    protected String id;
    protected String name;
    protected String type;

    private Map<String, IDNamedElement> previousElements = new LinkedHashMap<>();
    private Map<String, IDNamedElement> followingElements = new LinkedHashMap<>();

    protected IDNamedElement(Element namedElement) {
        id = namedElement.getAttribute("id");
        name = namedElement.getAttribute("name");
        type = namedElement.hasAttribute("type") ? namedElement.getAttribute("type") : "";
    }

    protected IDNamedElement(Element namedElement, String defaultTypeForSubclass) {
        id = namedElement.getAttribute("id");
        name = namedElement.getAttribute("name");
        type = namedElement.hasAttribute("type") ? namedElement.getAttribute("type") : namedElement.hasAttribute("role") ? namedElement.getAttribute("role") : defaultTypeForSubclass;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUniqueName() {
        String transformedName = name.replace('-', '_').replace(" ", "").replace("(", "_").replace(")", "_");
        String firstNChars = transformedName.substring(0, Math.min(transformedName.length(), 22)); // up to 25 chars taken
        return "El_" + firstNChars + "___" + id.substring(0, 4); // mora veliko prvo slovo!
    }

    public Map<String, IDNamedElement> getFollowingElements() {
        return followingElements;
    }

    public Map<String, IDNamedElement> getPreviousElements() {
        return previousElements;
    }
}

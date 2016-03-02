package de.viadee.mvc.view;

import java.util.Collection;

import de.viadee.mvc.model.Element;

public class View {

    private Collection<Element> elementList;

    public View(Collection<Element> element) {
        elementList = element;
    }

    public View(Element element) {

    }
}

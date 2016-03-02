package de.viadee.mvc.model;

import java.util.ArrayList;

public class Model {

    public Element getElementByID(int iD) {
        Element element = new Element();
        return element;

    }

    public ArrayList<Element> getAllElements() {
        ArrayList<Element> elementList = new ArrayList<Element>();
        elementList.add(new Element());
        elementList.add(new Element());
        elementList.add(new Element());
        elementList.add(new Element());
        return elementList;
    }

}

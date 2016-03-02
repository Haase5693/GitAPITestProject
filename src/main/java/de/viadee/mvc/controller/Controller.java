package de.viadee.mvc.controller;

import java.util.ArrayList;

import de.viadee.mvc.model.Element;
import de.viadee.mvc.model.Model;
import de.viadee.mvc.view.View;

public class Controller {

    public View Get() {
        Model model = new Model();
        ArrayList<Element> ElementList = model.getAllElements();
        return new View(ElementList);
    }

    public View Get(int ID) {
        Model model = new Model();
        Element element = model.getElementByID(ID);
        return new View(element);
    }
}

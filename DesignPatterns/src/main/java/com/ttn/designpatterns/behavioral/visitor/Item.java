package com.ttn.designpatterns.behavioral.visitor;

public class Item implements Visitable {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        // nothing to do here.
    }
}

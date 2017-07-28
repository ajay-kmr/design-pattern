package com.ttn.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements Visitable {

    private String name;
    private List<Item> items = new ArrayList();

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void accept(Visitor visitor) {
        for (Item item : items) {
            visitor.visit(item);
            item.accept(visitor);
        }
    }
}

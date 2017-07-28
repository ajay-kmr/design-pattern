package com.ttn.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Visitable {

    private String name;
    private List<Order> orders = new ArrayList<Order>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(Visitor visitor) {
        for (Order order : orders) {
            visitor.visit(order);
            order.accept(visitor);
        }
    }
}

package com.ttn.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup implements Visitable {

    private List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void accept(Visitor visitor) {
        for (Customer customer : customers) {
            visitor.visit(customer);
            customer.accept(visitor);
        }
    }
}

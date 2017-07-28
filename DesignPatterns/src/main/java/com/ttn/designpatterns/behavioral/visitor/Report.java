package com.ttn.designpatterns.behavioral.visitor;

public class Report implements Visitor {

    private int customersCount = 0;
    private int ordersCount = 0;
    private int itemsCount = 0;

    public void visit(Customer customer) {
        System.out.println("\n" + customer.getName());
        customersCount++;
    }

    public void visit(Order order) {
        System.out.println(order.getName());
        ordersCount++;
    }

    public void visit(Item item) {
        System.out.println(item.getName());
        itemsCount++;
    }

    public void displayStatistics() {
        System.out.println("\nNo. of customers : " + customersCount);
        System.out.println("No. of orders : " + ordersCount);
        System.out.println("No. of items : " + itemsCount);
    }
}

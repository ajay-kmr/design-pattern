package com.ttn.designpatterns.behavioral.visitor;

public class VisitorClient {

	public static void main(String[] args) {
		
		// Sample items.
		Item item1 = new Item("Item1");
		Item item2 = new Item("Item2");
		Item item3 = new Item("Item3");
		
		// Sample orders.
		Order order1 = new Order("Order1");
		order1.addItem(item1);
		order1.addItem(item2);
		order1.addItem(item3);
		
		Order order2 = new Order("Order2");
		order2.addItem(item2);
		order2.addItem(item3);
		
		Order order3 = new Order("Order3");
		order3.addItem(item1);
		order3.addItem(item2);
		
		// Sample Customers.
		Customer customer1 = new Customer("Paul");
		customer1.addOrder(order1);
		customer1.addOrder(order2);
		
		Customer customer2 = new Customer("Bob");
		customer2.addOrder(order3);
		
		CustomerGroup customerGroup = new CustomerGroup();
		customerGroup.addCustomer(customer1);
		customerGroup.addCustomer(customer2);
		
		
		// Visitor.
		Report visitor = new Report();
		
		customerGroup.accept(visitor);
		visitor.displayStatistics();
	}
}

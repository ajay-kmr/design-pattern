package com.ttn.designpatterns.behavioral.visitor;

public interface Visitor {

	public void visit(Customer customer);
	public void visit(Order order);
	public void visit(Item item);
}

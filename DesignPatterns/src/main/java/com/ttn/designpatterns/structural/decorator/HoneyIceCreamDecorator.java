package com.ttn.designpatterns.structural.decorator;

public class HoneyIceCreamDecorator extends IceCreamDecorator {

	public HoneyIceCreamDecorator(IceCream decoratedIceCream) {
		super(decoratedIceCream);
	}
	
	@Override
	public String make() {
		return (super.make() + addHoney());
	}
	
	private String addHoney() {
		return " plus honey";
	}
}

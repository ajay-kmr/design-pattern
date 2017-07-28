package com.ttn.designpatterns.structural.decorator;

public class NuttyIceCreamDecorator extends IceCreamDecorator {

	public NuttyIceCreamDecorator(IceCream decoratedIceCream) {
		super(decoratedIceCream);
	}

	@Override
	public String make() {
		return (super.make() + addNuts());
	}
	
	private String addNuts() {
		return " plus nuts";
	}
}

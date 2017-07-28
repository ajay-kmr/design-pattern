package com.ttn.designpatterns.exercise.exercise3;

public class Chocolate extends Topping {

	public Chocolate(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int cost() {
		return (super.cost() + 5);
	}
}

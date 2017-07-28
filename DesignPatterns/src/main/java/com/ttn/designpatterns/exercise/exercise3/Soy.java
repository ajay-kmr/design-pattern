package com.ttn.designpatterns.exercise.exercise3;

public class Soy extends Topping {

	public Soy(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int cost() {
		return (super.cost() + 3);
	}
}

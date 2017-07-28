package com.ttn.designpatterns.exercise.exercise3;

public abstract class Topping extends Coffee {

	private Coffee coffee;
	
	public Topping(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public int cost() {
		return (coffee.cost());
	}
}

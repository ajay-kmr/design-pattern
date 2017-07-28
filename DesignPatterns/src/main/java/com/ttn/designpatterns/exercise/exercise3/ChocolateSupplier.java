package com.ttn.designpatterns.exercise.exercise3;

public class ChocolateSupplier implements Supplier {

	@Override
	public Coffee supply(Coffee coffee) {
		return (new Chocolate(coffee));
	}
}

package com.ttn.designpatterns.exercise.exercise3;

public class SoySupplier implements Supplier {

	@Override
	public Coffee supply(Coffee coffee) {
		return (new Soy(coffee));
	}
}

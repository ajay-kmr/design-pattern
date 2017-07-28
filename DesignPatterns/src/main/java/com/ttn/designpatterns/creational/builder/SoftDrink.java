package com.ttn.designpatterns.creational.builder;

public abstract class SoftDrink implements Item {

	public Packing packing() {
		return (new PlasticBottle());
	}
}

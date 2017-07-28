package com.ttn.designpatterns.creational.builder;

public interface Item {

	public String name();
	
	public Packing packing();
	
	public double price();
}

package com.ttn.designpatterns.creational.abstractfactory;

public final class ComputerAbstractFactory {

	public static Computer getComputer(String type) {
		
		Computer computer = null;
		
		if(type.equals("desktop")) {
			computer = new Desktop();
		} else {
			computer = new Laptop();
		}
		
		return computer;
	}
}

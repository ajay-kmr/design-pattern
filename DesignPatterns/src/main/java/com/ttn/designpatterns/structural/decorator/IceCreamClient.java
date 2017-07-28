package com.ttn.designpatterns.structural.decorator;

public class IceCreamClient {

	public static void main(String[] args) {
		
		IceCream iceCream = new SimpleIceCream();
		System.out.println(iceCream.make());
		
		iceCream = new NuttyIceCreamDecorator(new SimpleIceCream());
		System.out.println(iceCream.make());
		
		iceCream = new HoneyIceCreamDecorator(new NuttyIceCreamDecorator(new SimpleIceCream()));
		System.out.println(iceCream.make());
	}
}

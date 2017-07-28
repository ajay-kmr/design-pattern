package com.ttn.designpatterns.creational.prototype;

// Prototype is used to avoid creation of costly objects.
public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Prototypable prototypable = new Prototypable();
		Prototypable prototypable2 = (Prototypable) prototypable.clone();
		
		System.out.println("Prototype created : " + (prototypable != prototypable2));
	}
}

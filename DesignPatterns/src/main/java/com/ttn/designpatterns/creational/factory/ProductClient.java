package com.ttn.designpatterns.creational.factory;

public class ProductClient {

	public static void main(String[] args) {
		
		ProductFactory factory = new ProductFactory();
		
		Product productOne = factory.createProduct(ProductType.PRODUCT1);
		System.out.println("first product is of type : '" + productOne.getClass().getCanonicalName() + "'.");
		
		Product productTwo = factory.createProduct(ProductType.PRODUCT2);
		System.out.println("second product is of type : '" + productTwo.getClass().getCanonicalName() + "'.");
	}
}

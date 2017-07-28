package com.ttn.designpatterns.exercise.exercise3;

import java.util.Arrays;

public class CoffeeUser {

	public static void main(String[] args) {
		
		FoodChain foodChain = new FoodChain();
		
		Coffee coffee = foodChain.order(null);
		System.out.println("Cost : " + coffee.cost());
		
		coffee = foodChain.order(Arrays.asList(new ToppingType[] {ToppingType.CHOCOLATE}));
		System.out.println("Cost : " + coffee.cost());
		
		coffee = foodChain.order(Arrays.asList(new ToppingType[] {ToppingType.SOY}));
		System.out.println("Cost : " + coffee.cost());
		
		coffee = foodChain.order(Arrays.asList(new ToppingType[] {ToppingType.CHOCOLATE, ToppingType.SOY}));
		System.out.println("Cost : " + coffee.cost());
	}
}

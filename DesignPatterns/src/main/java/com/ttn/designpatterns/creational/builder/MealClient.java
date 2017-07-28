package com.ttn.designpatterns.creational.builder;

public class MealClient {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		System.out.println("Preparing Veg Meal...");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.display();
		System.out.println("Total cost : " + vegMeal.cost());
		
		System.out.println("\nPreparing Non-veg Meal...");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.display();
		System.out.println("Total cost : " + nonVegMeal.cost());
	}
}

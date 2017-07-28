package com.ttn.designpatterns.creational.builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Mirinda());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}

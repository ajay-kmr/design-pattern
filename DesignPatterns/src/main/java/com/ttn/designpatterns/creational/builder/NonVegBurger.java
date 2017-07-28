package com.ttn.designpatterns.creational.builder;

public class NonVegBurger extends Burger {

    public String name() {
        return "Non-veg Burger";
    }

    public double price() {
        return 38.0;
    }
}

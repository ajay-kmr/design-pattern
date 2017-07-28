package com.ttn.designpatterns.creational.builder;

public class VegBurger extends Burger {

    public String name() {
        return "Veg Burger";
    }

    public double price() {
        return 25.0;
    }
}

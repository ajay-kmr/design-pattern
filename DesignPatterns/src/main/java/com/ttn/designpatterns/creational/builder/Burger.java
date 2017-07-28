package com.ttn.designpatterns.creational.builder;

public abstract class Burger implements Item {

    public Packing packing() {
        return (new PaperBag());
    }
}

package com.ttn.designpatterns.structural.decorator;

public abstract class IceCreamDecorator implements IceCream {

    private IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }

    public String make() {
        return (decoratedIceCream.make());
    }
}

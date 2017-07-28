package com.ttn.designpatterns.behavioral.state3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class VendingMachine {
    private State current;

    public VendingMachine() {
        current = StartState.getInstance();
    }

    public void setState(State state) {
        current = state;
        System.out.println("You are at state:- " + current.getClass());
    }

    public void operate() {
        current.operate(this);
    }
}

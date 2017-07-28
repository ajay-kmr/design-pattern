package com.ttn.designpatterns.behavioral.state;

public class OffState implements State {

    public void regulate(TableFanRegulator regulator) {
        regulator.setCurrentState(new LowSpeedState());
        System.out.println("Table fan is running at low speed.");
    }
}

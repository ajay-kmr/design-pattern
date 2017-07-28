package com.ttn.designpatterns.behavioral.state;

public class HighSpeedState implements State {

    public void regulate(TableFanRegulator regulator) {
        regulator.setCurrentState(new OffState());
        System.out.println("Table fan is off.");
    }
}

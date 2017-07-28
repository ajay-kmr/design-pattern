package com.ttn.designpatterns.behavioral.state;

public class LowSpeedState implements State {

    public void regulate(TableFanRegulator regulator) {
        regulator.setCurrentState(new HighSpeedState());
        System.out.println("Table fan is running at high speed.");
    }
}

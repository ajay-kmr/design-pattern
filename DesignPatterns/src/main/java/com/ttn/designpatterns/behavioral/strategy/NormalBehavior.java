package com.ttn.designpatterns.behavioral.strategy;

public class NormalBehavior implements Behavior {

    public int moveCommand(String robotName) {
        System.out.println("Ignore if another robot found in arena by " + robotName + ".");
        return 0;
    }
}

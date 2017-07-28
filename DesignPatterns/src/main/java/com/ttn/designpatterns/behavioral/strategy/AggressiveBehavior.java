package com.ttn.designpatterns.behavioral.strategy;

public class AggressiveBehavior implements Behavior {

    public int moveCommand(String robotName) {
        System.out.println("Attack if another robot found in arena by " + robotName + ".");
        return 1;
    }
}

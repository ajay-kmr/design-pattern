package com.ttn.designpatterns.behavioral.strategy;

public class DefensiveBehavior implements Behavior {

    public int moveCommand(String robotName) {
        System.out.println("Run away from arena if another robot found by " + robotName + ".");
        return -1;
    }
}

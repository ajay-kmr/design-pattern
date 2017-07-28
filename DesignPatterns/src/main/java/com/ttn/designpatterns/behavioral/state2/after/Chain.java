package com.ttn.designpatterns.behavioral.state2.after;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Chain {
    private State current;

    public Chain() {
        current = new Off();
    }

    public void setState(State state) {
        current = state;
    }

    public void pull() {
        current.pull(this);
    }
}

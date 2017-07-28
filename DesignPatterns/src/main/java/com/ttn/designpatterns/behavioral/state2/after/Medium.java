package com.ttn.designpatterns.behavioral.state2.after;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Medium extends State {
    public void pull(Chain wrapper) {
        wrapper.setState(new High());
        System.out.println("   high speed");
    }
}

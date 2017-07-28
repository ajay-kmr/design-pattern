package com.ttn.designpatterns.behavioral.state2.after;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Low extends State {
    public void pull(Chain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("   medium speed");
    }
}

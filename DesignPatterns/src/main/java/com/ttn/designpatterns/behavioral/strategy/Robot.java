package com.ttn.designpatterns.behavioral.strategy;

@SuppressWarnings("unused")
public class Robot {

	private String name;
	private Behavior behavior;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void move() {
		int command = behavior.moveCommand(name);
		// do something with the 'command' variable.
	}
}

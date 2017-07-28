package com.ttn.designpatterns.behavioral.state;

public class TableFanRegulator {

	private State currentState;
	
	public TableFanRegulator() {
		currentState = new OffState();
	}
	
	public void setCurrentState(State newState) {
		currentState = newState;
	}
	
	public void regulate() {
		currentState.regulate(this);
	}
}

package com.ttn.designpatterns.behavioral.state;

public class StateClient {

	public static void main(String[] args) throws InterruptedException {
		
		TableFanRegulator regulator = new TableFanRegulator();
		
		// Turns the table fan on with low speed.
		regulator.regulate();
		Thread.sleep(2000);
		
		// Turns the table fan on with high speed.
		regulator.regulate();
		Thread.sleep(5000);
		
		// Turns the table fan off.
		regulator.regulate();
	}
}

package com.ttn.designpatterns.behavioral.mediator;

public interface Colleague {

	public void send(String message);
	
	public void receive(String message);
	
	public String getName();
}

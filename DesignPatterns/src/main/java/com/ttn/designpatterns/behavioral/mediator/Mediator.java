package com.ttn.designpatterns.behavioral.mediator;

public interface Mediator {

	public void addColleague(Colleague colleague);
	
	public void send(String message, Colleague originator);
}

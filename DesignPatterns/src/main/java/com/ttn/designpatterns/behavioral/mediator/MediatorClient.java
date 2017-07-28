package com.ttn.designpatterns.behavioral.mediator;

public class MediatorClient {

	public static void main(String[] args) {
		
		Mediator mediator = new ConcreteMediator();
		
		Colleague colleague1 = new ConcreteColleague("Paul", mediator);
		Colleague colleague2 = new ConcreteColleague("Ken", mediator);
		Colleague colleague3 = new ConcreteColleague("Rod", mediator);
		Colleague colleague4 = new ConcreteColleague("Bob", mediator);
		
		// Add all colleagues to the mediator so that it knows about them.
		mediator.addColleague(colleague1);
		mediator.addColleague(colleague2);
		mediator.addColleague(colleague3);
		mediator.addColleague(colleague4);
		
		// Message would be notified to everyone else by mediator.
		colleague1.send("Message from " + colleague1.getName());
		colleague3.send("New message from " + colleague3.getName());
	}
}

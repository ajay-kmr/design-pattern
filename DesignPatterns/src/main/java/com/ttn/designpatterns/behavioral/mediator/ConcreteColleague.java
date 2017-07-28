package com.ttn.designpatterns.behavioral.mediator;

public class ConcreteColleague implements Colleague {

    private String name;
    private Mediator mediator;

    public ConcreteColleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println("\n" + name + " sending the message '" + message + "'.\n");
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received the message '" + message + "'.");
    }

    public String getName() {
        return name;
    }
}

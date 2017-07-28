package com.ttn.designpatterns.behavioral.visitor;

public interface Visitable {

	public void accept(Visitor visitor);
}

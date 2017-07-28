package com.ttn.designpatterns.behavioral.chainofresponsibility;

public final class Request {

	private int value;
	
	public Request(int requestValue) {
		value = requestValue;
	}
	
	public int getValue() {
		return value;
	}
}

package com.ttn.designpatterns.behavioral.chainofresponsibility;

public final class ZeroHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue() == 0) {
			System.out.println("I have handled zero-valued request " + request.getValue() + ".\n");
		} else {
			System.out.println("Passing " + request.getValue() + " to " + nextHandlerInChain.getClass().getSimpleName() + ".");
			nextHandlerInChain.handleRequest(request);
		}
	}
}

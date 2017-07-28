package com.ttn.designpatterns.behavioral.chainofresponsibility;

public final class PositiveHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue() > 0) {
			System.out.println("I have handled positive-valued request " + request.getValue() + ".\n");
		} else {
			System.out.println("Passing " + request.getValue() + " to " + nextHandlerInChain.getClass().getSimpleName() + ".");
			nextHandlerInChain.handleRequest(request);
		}
	}
}

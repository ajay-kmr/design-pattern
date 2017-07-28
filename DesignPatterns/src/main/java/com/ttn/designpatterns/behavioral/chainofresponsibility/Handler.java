package com.ttn.designpatterns.behavioral.chainofresponsibility;

public abstract class Handler {

	protected Handler nextHandlerInChain;
	
	public void setSuccessor(Handler successorHandler) {
		nextHandlerInChain = successorHandler;
	}
	
	public abstract void handleRequest(Request request);
}

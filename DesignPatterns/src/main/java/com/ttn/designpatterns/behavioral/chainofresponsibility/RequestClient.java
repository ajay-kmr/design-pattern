package com.ttn.designpatterns.behavioral.chainofresponsibility;

public class RequestClient {

	public static void main(String[] args) {
		
		Handler h1 = new NegativeHandler();
		Handler h2 = new PositiveHandler();
		Handler h3 = new ZeroHandler();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		// h1 will handle it.
		h1.handleRequest(new Request(-5));
		
		// h1 will pass the request to h2, h2 will handle it.
		h1.handleRequest(new Request(14));
		
		// h1 will pass the request to h2, h2 will pass it to h3, h3 will handle it.
		h1.handleRequest(new Request(0));
	}
}

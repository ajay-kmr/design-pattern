package com.ttn.designpatterns.behavioral.observer;

public class ObserverClient {

	public static void main(String[] args) {
		
		// Create subscribers (observers).
		Subscriber subscriber1 = new EmailSubscriber();
		Subscriber subscriber2 = new EmailSubscriber();
		Subscriber subscriber3 = new SMSSubscriber();
		
		// Create publisher (observable) and attach the observers.
		NewsPublisher publisher = new BusinessNewsPublisher();
		publisher.attachSubscriber(subscriber1);
		publisher.attachSubscriber(subscriber2);
		publisher.attachSubscriber(subscriber3);
		
		// Add news, will be notified to all the three subscribers.
		publisher.addNews("News 1");
		System.out.println();
		
		publisher.addNews("News 2");
		System.out.println();
		
		// Remove one of the subscribers.
		publisher.removeSubscriber(subscriber2);
		
		// Add news again, will now be notified to only two subscribers.
		publisher.addNews("Mews 3");
	}
}

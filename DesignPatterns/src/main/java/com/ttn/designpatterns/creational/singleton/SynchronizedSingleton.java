package com.ttn.designpatterns.creational.singleton;

public class SynchronizedSingleton {

	private static volatile SynchronizedSingleton SINGLETON;
	
	private SynchronizedSingleton() {
		
	}
	
	public static synchronized SynchronizedSingleton getInstance() {
		if(SINGLETON == null) {
			SINGLETON = new SynchronizedSingleton();
		}
		return SINGLETON;
	}
}

package com.ttn.designpatterns.creational.singleton;

public final class NoSynchronizedSingleton {

	private static final NoSynchronizedSingleton SINGLETON = new NoSynchronizedSingleton();
	
	private NoSynchronizedSingleton() {
		
	}
	
	public static NoSynchronizedSingleton getInstance() {
		return SINGLETON;
	}
}

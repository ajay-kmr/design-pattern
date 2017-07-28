package com.ttn.designpatterns.creational.singleton;

public final class DoubleLockSingleton {

	private static volatile DoubleLockSingleton SINGLETON;
	
	private DoubleLockSingleton() {
		
	}
	
	public static DoubleLockSingleton getInstance() {
		// first null check.
		if(SINGLETON == null) {
			synchronized (DoubleLockSingleton.class) {
				// second null check.
				if(SINGLETON == null) {
					SINGLETON = new DoubleLockSingleton();
				}
			}
		}
		return SINGLETON;
	}
}

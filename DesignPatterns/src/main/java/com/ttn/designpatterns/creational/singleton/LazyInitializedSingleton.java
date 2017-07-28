package com.ttn.designpatterns.creational.singleton;

// Bill Pugh solution.
public final class LazyInitializedSingleton {

	private LazyInitializedSingleton() {
		
	}
	
	private static class LazyHolder {
		private static final LazyInitializedSingleton INSTANCE = new LazyInitializedSingleton();
	}
	
	public static LazyInitializedSingleton getInstance() {
		return (LazyHolder.INSTANCE);
	}
}

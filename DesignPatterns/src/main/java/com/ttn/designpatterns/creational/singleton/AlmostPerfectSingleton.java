package com.ttn.designpatterns.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class AlmostPerfectSingleton implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -2802337536093087871L;
	private static final AlmostPerfectSingleton SINGLETON = new AlmostPerfectSingleton();

	private AlmostPerfectSingleton() {
		
	}
	
	public static AlmostPerfectSingleton getInstance() {
		return SINGLETON;
	}
	
	protected Object readResolve() throws ObjectStreamException {
		return SINGLETON;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return SINGLETON;		// or throw an exception.
	}
}

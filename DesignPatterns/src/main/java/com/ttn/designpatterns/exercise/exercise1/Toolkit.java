package com.ttn.designpatterns.exercise.exercise1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class Toolkit implements Serializable {

	private static final long serialVersionUID = -744988862458244748L;
	private static final Toolkit INSTANCE = new Toolkit();
	
	public static Toolkit getInstance() {
		return INSTANCE;
	}
	
	private Toolkit() {
		
	}
	
	protected Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
	
	public LookAndFeel getGUIToolkit(boolean windows) {
		return (windows ? new WindowsLookAndFeel() : new LinuxLookAndFeel());
	}
}

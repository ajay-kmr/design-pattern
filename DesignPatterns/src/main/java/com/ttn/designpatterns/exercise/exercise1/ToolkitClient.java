package com.ttn.designpatterns.exercise.exercise1;

public class ToolkitClient {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getInstance();
		LookAndFeel lookAndFeel = toolkit.getGUIToolkit(true);
		
		System.out.println(lookAndFeel.createButton());
		System.out.println(lookAndFeel.createTextBox());
	}
}

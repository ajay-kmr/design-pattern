package com.ttn.designpatterns.exercise.exercise1;

public class WindowsLookAndFeel extends LookAndFeel {

	@Override
	public Button createButton() {
		return (new WindowsButton());
	}

	@Override
	public TextBox createTextBox() {
		return (new WindowsTextBox());
	}
}

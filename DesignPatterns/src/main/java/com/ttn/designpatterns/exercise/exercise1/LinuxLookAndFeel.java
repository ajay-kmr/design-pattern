package com.ttn.designpatterns.exercise.exercise1;

public class LinuxLookAndFeel extends LookAndFeel {

	@Override
	public Button createButton() {
		return (new LinuxButton());
	}

	@Override
	public TextBox createTextBox() {
		return (new LinuxTextBox());
	}
}

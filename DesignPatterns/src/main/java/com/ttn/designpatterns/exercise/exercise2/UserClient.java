package com.ttn.designpatterns.exercise.exercise2;

public class UserClient {

	public static void main(String[] args) {
		
		Console console = new Printer();
		IOutput output = new Output(console);
		output.drawCircle(5, 14, 20);
		
		console = new Screen();
		output = new Output(console);
		output.drawLine(2, 3, 4, 6);
	}
}

package com.ttn.designpatterns.exercise.exercise2;

public class Output implements IOutput {
	
	private Console console;
	
	public Output(Console console) {
		this.console = console;
	}

	@Override
	public void drawCircle(int x, int y, int r) {
		Shape circle = new Circle(x, y, r);
		console.print(circle);
	}

	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		Shape line = new Line(x1, y1, x2, y2);
		console.print(line);
	}
}

package com.ttn.designpatterns.exercise.exercise2;

public class Printer implements Console {
	
	@Override
	public void print(Shape shape) {
		if(shape instanceof Circle) {
			printCircle((Circle) shape);
		} else {
			printLine((Line) shape);
		}
	}

	private void printCircle(Circle circle) {
		System.out.println(
				"Drawing a circle with co-ordinates (" + circle.getX() + ", "
				+ circle.getY() + ") with radius = '" + circle.getRadius() + "' on printer.");
	}

	private void printLine(Line line) {
		System.out.println(
				"Drawing a line from co-ordinates (" + line.getX1() + ", "
				+ line.getY1() + ") to (" + line.getX2() + ", " + line.getY2()
				+ ") on printer.");
	}
}

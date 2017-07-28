package com.ttn.designpatterns.structural.flyweight;

public class LineClient {

	public static void main(String[] args) {
		
		String color = "blue";
		Line line = LineFlyweightFactory.getLine(color);
		
		// Every line knows how to draw (intrinsic state).
		line.draw();
		
		// Call method specific to blue line (extrinsic state).
		BlueLine blueLine = (BlueLine) line;
		blueLine.blueLineMethod();
		
		// Obtain another blue line.
		Line line2 = LineFlyweightFactory.getLine(color);
		System.out.println("Reusing pool : " + (line == line2));
	}
}

package com.ttn.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class LineFlyweightFactory {

	private static Map<String, Line> LINE_POOL = new HashMap<String, Line>();
	
	public static Line getLine(String color) {
		
		Line line = null;
		
		// First check the pool.
		if(LINE_POOL.containsKey(color)) {
			line = LINE_POOL.get(color);
		} else {
			
			if("white".equalsIgnoreCase(color)) {
				line = new WhiteLine();
			} else {
				line = new BlueLine();
			}
			
			// Add it to pool.
			LINE_POOL.put(color, line);
		}
		
		return line;
	}
}

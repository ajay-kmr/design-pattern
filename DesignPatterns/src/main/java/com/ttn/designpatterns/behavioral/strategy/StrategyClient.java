package com.ttn.designpatterns.behavioral.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		
		Robot robot1 = new Robot("R1");
		Robot robot2 = new Robot("R2");
		Robot robot3 = new Robot("R3");
		
		robot1.setBehavior(new AggressiveBehavior());
		robot2.setBehavior(new DefensiveBehavior());
		robot3.setBehavior(new NormalBehavior());
		
		robot1.move();
		robot2.move();
		robot3.move();
		System.out.println();
		
		robot1.setBehavior(new DefensiveBehavior());
		robot2.setBehavior(new AggressiveBehavior());
		
		robot1.move();
		robot2.move();
		robot3.move();
	}
}

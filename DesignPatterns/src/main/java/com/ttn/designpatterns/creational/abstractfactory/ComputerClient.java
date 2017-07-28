package com.ttn.designpatterns.creational.abstractfactory;

public class ComputerClient {

	public static void main(String[] args) {
		
		Computer computer = ComputerAbstractFactory.getComputer("laptop");
		
		Part monitor = computer.getMonitor();
		Part ram = computer.getRAM();
		Part processor = computer.getProcessor();
		
		System.out.println("Monitor : " + monitor.getSpecification());
		System.out.println("Processor : " + processor.getSpecification());
		System.out.println("RAM : " + ram.getSpecification());
	}
}

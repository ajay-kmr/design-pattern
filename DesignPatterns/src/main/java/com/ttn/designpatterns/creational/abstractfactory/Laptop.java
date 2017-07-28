package com.ttn.designpatterns.creational.abstractfactory;

public class Laptop extends Computer {

	@Override
	public Part getMonitor() {
		return (new Monitor("15 inches"));
	}

	@Override
	public Part getProcessor() {
		return (new Processor("i3"));
	}

	@Override
	public Part getRAM() {
		return (new RAM("2 GB"));
	}
}

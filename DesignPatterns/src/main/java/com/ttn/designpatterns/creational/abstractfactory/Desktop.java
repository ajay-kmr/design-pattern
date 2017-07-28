package com.ttn.designpatterns.creational.abstractfactory;

public class Desktop extends Computer {

	@Override
	public Part getMonitor() {
		return (new Monitor("21 inches"));
	}

	@Override
	public Part getProcessor() {
		return (new Processor("Intel Quad Core"));
	}

	@Override
	public Part getRAM() {
		return (new RAM("8 GB"));
	}
}

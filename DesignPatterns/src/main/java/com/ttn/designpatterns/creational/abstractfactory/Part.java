package com.ttn.designpatterns.creational.abstractfactory;

public abstract class Part {

	private String specification;
	
	public Part(String specification) {
		this.specification = specification;
	}

	public String getSpecification() {
		return specification;
	}
}

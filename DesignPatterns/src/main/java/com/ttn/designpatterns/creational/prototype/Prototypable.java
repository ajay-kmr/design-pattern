package com.ttn.designpatterns.creational.prototype;

public class Prototypable implements Cloneable {
	
	private Integer width;
	private String name;
	
	public Prototypable() {
		
	}
	
	public Prototypable(Integer width, String name) {
		this.width = width;
		this.name = name;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (super.clone());
	}
}

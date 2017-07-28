package com.ttn.designpatterns.structural.facade;

import java.io.Serializable;

public class Flight implements Serializable {

	private static final long serialVersionUID = -7010914303447983092L;

	private String flightName;
	
	public Flight(String name) {
		flightName = name;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
}

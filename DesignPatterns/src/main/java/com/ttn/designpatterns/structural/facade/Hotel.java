package com.ttn.designpatterns.structural.facade;

import java.io.Serializable;

public class Hotel implements Serializable {

	private static final long serialVersionUID = -648241533231000700L;

	private String hotelName;
	
	public Hotel(String name) {
		hotelName = name;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}

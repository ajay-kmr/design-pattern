package com.ttn.designpatterns.structural.facade;

import java.io.Serializable;
import java.util.List;

public final class TravelComposite implements Serializable {

	private static final long serialVersionUID = -150939987452687303L;

	private List<Flight> flights;
	private List<Hotel> hotels;
	
	public List<Flight> getFlights() {
		return flights;
	}
	
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	public List<Hotel> getHotels() {
		return hotels;
	}
	
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
}

package com.ttn.designpatterns.structural.facade;

import java.util.List;

public final class TravelFacade {

	public TravelComposite getTravelStatistics(String location) {
		
		TravelComposite travelComposite = new TravelComposite();
		
		FlightService flightService = new FlightService();
		List<Flight> flights = flightService.getFlights(location);
		travelComposite.setFlights(flights);
		
		HotelService hotelService = new HotelService();
		List<Hotel> hotels = hotelService.getHotels(location);
		travelComposite.setHotels(hotels);
		
		return travelComposite;
	}
}

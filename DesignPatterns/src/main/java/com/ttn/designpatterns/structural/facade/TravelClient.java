package com.ttn.designpatterns.structural.facade;

public class TravelClient {

	public static void main(String[] args) {
		
		String location = "Goa";
		
		TravelFacade travelFacade = new TravelFacade();
		TravelComposite composite = travelFacade.getTravelStatistics(location);
		
		System.out.println("Flights : ");
		for(Flight flight : composite.getFlights()) {
			System.out.println(flight.getFlightName());
		}
		
		System.out.println("\nHotels : ");
		for(Hotel hotel : composite.getHotels()) {
			System.out.println(hotel.getHotelName());
		}
	}
}

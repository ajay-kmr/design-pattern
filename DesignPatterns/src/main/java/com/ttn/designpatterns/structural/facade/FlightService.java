package com.ttn.designpatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    public List<Flight> getFlights(String location) {

        List<Flight> flights = new ArrayList<Flight>();

        // Based on location, get the flights.
        flights.add(new Flight("Indigo"));
        flights.add(new Flight("GoAir"));

        return flights;
    }
}

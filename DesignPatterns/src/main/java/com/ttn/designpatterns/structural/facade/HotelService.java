package com.ttn.designpatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

    public List<Hotel> getHotels(String location) {

        List<Hotel> hotels = new ArrayList<Hotel>();

        // Based on location, get the hotels.
        hotels.add(new Hotel("Sheraton"));
        hotels.add(new Hotel("Grandeur"));
        hotels.add(new Hotel("Taj"));

        return hotels;
    }
}

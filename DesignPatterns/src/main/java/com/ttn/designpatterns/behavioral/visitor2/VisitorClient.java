package com.ttn.designpatterns.behavioral.visitor2;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class VisitorClient {

    public static void main(String[] args) {
        // Sample Rooms.
        Room room1 = new Room("Room-1 Of Type:- Full Board", "Includes bed, breakfast, packed lunch and evening meal.", 1000D);
        Room room2 = new Room("Room-2 of Type:- Half Board", "Includes bed, breakfast and evening meal (no packed lunch).", 1500D);
        Room room3 = new Room("Room-3 of Type:- Bread And Breakfast", "Includes bed and breakfast only.", 2000D);

        // Sample Hotels.
        Hotel hotel1 = new Hotel("Hotel-1");
        hotel1.addRoom(room1);
        hotel1.addRoom(room2);
        hotel1.addRoom(room3);

        Hotel hotel2 = new Hotel("Hotel-2");
        hotel2.addRoom(room2);
        hotel2.addRoom(room3);

        Hotel hotel3 = new Hotel("Hotel-3");
        hotel3.addRoom(room1);
        hotel3.addRoom(room2);

        // Sample Package.
        Package package1 = new Package("1", "Sonu Ka Package");
        package1.addHotel(hotel1);
        package1.addHotel(hotel2);

        Package package2 = new Package("2", "3 Day 4 Night");
        package2.addHotel(hotel3);

        Cart cart = new Cart();
        cart.addPackage(package1);
        cart.addPackage(package2);

        // Visitor.
        Map<Package, Double> packageCommissionMatrix = new HashMap<Package, Double>(2);
        packageCommissionMatrix.put(package1, 10D);
        packageCommissionMatrix.put(package2, 15D);
        Map<Hotel, Double> hotelDiscountMatrix = new HashMap<Hotel, Double>(3);
        hotelDiscountMatrix.put(hotel1, 10D);
        hotelDiscountMatrix.put(hotel2, 20D);
        hotelDiscountMatrix.put(hotel3, 30D);
        Map<Room, Double> roomTaxMatrix = new HashMap<Room, Double>(3);
        roomTaxMatrix.put(room1, 2D);
        roomTaxMatrix.put(room2, 4D);
        roomTaxMatrix.put(room3, 6D);

        CartPriceCalculator visitor = new CartPriceCalculator(packageCommissionMatrix, hotelDiscountMatrix, roomTaxMatrix);
        visitor.visit(cart);
//        cart.accept(visitor);
        visitor.displayStatistics();
    }

}

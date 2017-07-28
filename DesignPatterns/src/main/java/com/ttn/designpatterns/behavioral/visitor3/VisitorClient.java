package com.ttn.designpatterns.behavioral.visitor3;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class VisitorClient {

    public static void main(String[] args) {
        TestDataGenerator prepareTestData = new TestDataGenerator().generateTestData();
        Map<Package, Double> packageCommissionMatrix = prepareTestData.getPackageCommissionMatrix();
        Map<Hotel, Double> hotelDiscountMatrix = prepareTestData.getHotelDiscountMatrix();
        Map<Room, Double> roomTaxMatrix = prepareTestData.getRoomTaxMatrix();
        Cart cart = prepareTestData.getCart();

        String businessType = "B2B";
        ICartPriceCalculator priceCalculator = CartPriceCalculatorFactory.getPriceCalculatorInstance(businessType,
                packageCommissionMatrix, hotelDiscountMatrix, roomTaxMatrix);
        PriceDetailDTO priceDetailDTO = priceCalculator.calculateTotalPrice(cart);

        System.out.println(priceDetailDTO.toString());

    }

    private static class TestDataGenerator {
        private Cart cart;
        private Map<Package, Double> packageCommissionMatrix;
        private Map<Hotel, Double> hotelDiscountMatrix;
        private Map<Room, Double> roomTaxMatrix;

        public Cart getCart() {
            return cart;
        }

        public Map<Package, Double> getPackageCommissionMatrix() {
            return packageCommissionMatrix;
        }

        public Map<Hotel, Double> getHotelDiscountMatrix() {
            return hotelDiscountMatrix;
        }

        public Map<Room, Double> getRoomTaxMatrix() {
            return roomTaxMatrix;
        }

        public TestDataGenerator generateTestData() {
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

            cart = new Cart();
            cart.addPackage(package1);
            cart.addPackage(package2);

            // Visitor.
            packageCommissionMatrix = new HashMap<Package, Double>(2);
            packageCommissionMatrix.put(package1, 10D);
            packageCommissionMatrix.put(package2, 15D);
            hotelDiscountMatrix = new HashMap<Hotel, Double>(3);
            hotelDiscountMatrix.put(hotel1, 10D);
            hotelDiscountMatrix.put(hotel2, 20D);
            hotelDiscountMatrix.put(hotel3, 30D);
            roomTaxMatrix = new HashMap<Room, Double>(3);
            roomTaxMatrix.put(room1, 2D);
            roomTaxMatrix.put(room2, 4D);
            roomTaxMatrix.put(room3, 6D);
            return this;
        }
    }
}

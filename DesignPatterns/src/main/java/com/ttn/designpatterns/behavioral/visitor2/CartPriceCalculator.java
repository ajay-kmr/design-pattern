package com.ttn.designpatterns.behavioral.visitor2;

import java.util.Map;

public class CartPriceCalculator implements Visitor {

    private Map<Package, Double> packageCommissionMatrix;
    private Map<Hotel, Double> hotelDiscountMatrix;
    private Map<Room, Double> roomTaxMatrix;

    private Double totalCommission = 0D;
    private Double totalDiscount = 0D;
    private Double totalTax = 0D;
    private Double totalPrice = 0D;
    private Double actualSellingPrice = 0D;

    private int packagesCount = 0;
    private int hotelsCount = 0;
    private int roomsCount = 0;

    public CartPriceCalculator(Map<Package, Double> packageCommissionMatrix, Map<Hotel, Double> hotelDiscountMatrix,
                               Map<Room, Double> roomTaxMatrix) {
        this.packageCommissionMatrix = packageCommissionMatrix;
        this.hotelDiscountMatrix = hotelDiscountMatrix;
        this.roomTaxMatrix = roomTaxMatrix;
    }

    public void visit(Cart cart) {
        System.out.println("\n Calculating Price Of Cart...");
        cart.accept(this);
    }

    public void visit(Package aPackage) {
        aPackage.accept(this);
        packagesCount++;
        Double packageCommission = packageCommissionMatrix.get(aPackage);
        packageCommission = (packageCommission != null && packageCommission > 0) ? packageCommission : 0;
        System.out.println("Commission for Package:- " + aPackage.getName() + "is:- " + packageCommission);
        totalCommission = totalCommission + packageCommission;
        actualSellingPrice = actualSellingPrice + packageCommission;
    }

    public void visit(Hotel hotel) {
        hotel.accept(this);
        hotelsCount++;
        Double discount = hotelDiscountMatrix.get(hotel);
        discount = (discount != null && discount > 0) ? discount : 0;
        System.out.println("Discount for Hotel:- " + hotel.getName() + "is:- " + discount);
        totalDiscount += discount;
        actualSellingPrice = actualSellingPrice - discount;
    }

    public void visit(Room room) {
        room.accept(this);
        roomsCount++;
        Double tax = roomTaxMatrix.get(room);
        tax = (tax != null && tax > 0) ? tax : 0;
        System.out.println("Tax applicable on room:- " + room.getName() + "is:- " + tax);
        totalTax = totalTax + tax;
        totalPrice = totalPrice + room.getPrice();
        actualSellingPrice = room.getPrice() + tax;
    }

    public void displayStatistics() {
        System.out.println("\nNo. of Packages : " + packagesCount);
        System.out.println("No. of Hotels : " + hotelsCount);
        System.out.println("No. of Rooms : " + roomsCount);
        System.out.println("Total Commission Collected From All Packages: " + totalCommission);
        System.out.println("Total Discount given For All Hotels: " + totalDiscount);
        System.out.println("Total Tax Collected From All Rooms: " + totalTax);
        System.out.println("Total Price Of All Rooms: " + totalPrice);
        System.out.println("Actual Selling Price: " + actualSellingPrice);
    }
}

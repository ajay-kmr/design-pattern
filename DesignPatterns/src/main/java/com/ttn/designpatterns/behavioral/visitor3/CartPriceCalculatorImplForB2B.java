package com.ttn.designpatterns.behavioral.visitor3;

import java.lang.*;
import java.util.Map;

public class CartPriceCalculatorImplForB2B implements Visitor, ICartPriceCalculator {

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

    public CartPriceCalculatorImplForB2B(Map<Package, Double> packageCommissionMatrix, Map<Hotel, Double> hotelDiscountMatrix,
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
        hotelsCount++;
        Double discount = hotelDiscountMatrix.get(hotel);
        discount = (discount != null && discount > 0) ? discount : 0;
        System.out.println("Discount for Hotel:- " + hotel.getName() + "is:- " + discount);
        totalDiscount += discount;
        //Note:- Discount is calculated before calculating tax..
        hotel.accept(this);
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

    public PriceDetailDTO calculateTotalPrice(Cart cart) {
        this.visit(cart);
        PriceDetailDTO priceDetailDTO = new PriceDetailDTO();
        priceDetailDTO.packagesCount = packagesCount;
        priceDetailDTO.hotelsCount = hotelsCount;
        priceDetailDTO.roomsCount = roomsCount;
        priceDetailDTO.totalCommission = totalCommission;
        priceDetailDTO.totalDiscount = totalDiscount;
        priceDetailDTO.totalTax = totalTax;
        priceDetailDTO.totalPrice = totalPrice;
        priceDetailDTO.actualSellingPrice = actualSellingPrice;
        return priceDetailDTO;

    }


}

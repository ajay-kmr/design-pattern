package com.ttn.designpatterns.behavioral.visitor3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class PriceDetailDTO {
    public Double totalCommission = 0D;
    public Double totalDiscount = 0D;
    public Double totalTax = 0D;
    public Double totalPrice = 0D;
    public Double actualSellingPrice = 0D;

    public int packagesCount = 0;
    public int hotelsCount = 0;
    public int roomsCount = 0;

    @Override
    public String toString() {
        return "PriceDetailDTO{" +
                "totalCommission=" + totalCommission +
                ", totalDiscount=" + totalDiscount +
                ", totalTax=" + totalTax +
                ", totalPrice=" + totalPrice +
                ", actualSellingPrice=" + actualSellingPrice +
                ", packagesCount=" + packagesCount +
                ", hotelsCount=" + hotelsCount +
                ", roomsCount=" + roomsCount +
                '}';
    }
}

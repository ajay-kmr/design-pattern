package com.ttn.designpatterns.behavioral.visitor3;

public interface ICartPriceCalculator {

    public PriceDetailDTO calculateTotalPrice(Cart cart);

}

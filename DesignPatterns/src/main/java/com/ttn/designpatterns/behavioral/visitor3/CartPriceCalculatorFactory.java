package com.ttn.designpatterns.behavioral.visitor3;

import java.lang.*;
import java.util.Map;

/**
 * Created by intelligrape on 28/7/17.
 */

// TODO :- Explain how to use Fly-Weight Design Pattern Here
public class CartPriceCalculatorFactory {
    public static ICartPriceCalculator getPriceCalculatorInstance(String businessType, Map<Package, Double> packageCommissionMatrix,
                                                                  Map<Hotel, Double> hotelDiscountMatrix,
                                                                  Map<Room, Double> roomTaxMatrix) {
        ICartPriceCalculator visitor = null;
        if ("B2B".equalsIgnoreCase(businessType)) {
            visitor = new CartPriceCalculatorImplForB2B(packageCommissionMatrix, hotelDiscountMatrix, roomTaxMatrix);
        } else {
            visitor = new CartPriceCalculatorImplForB2C(packageCommissionMatrix, hotelDiscountMatrix, roomTaxMatrix);
        }
        return visitor;
    }
}

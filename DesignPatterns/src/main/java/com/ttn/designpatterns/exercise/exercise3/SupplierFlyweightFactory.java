package com.ttn.designpatterns.exercise.exercise3;

import java.util.HashMap;
import java.util.Map;

public class SupplierFlyweightFactory {

    private static Map<ToppingType, Supplier> SUPPLIERS = new HashMap<ToppingType, Supplier>();

    public static Supplier getSupplier(ToppingType toppingType) {

        Supplier supplier = null;

        if (SUPPLIERS.containsKey(toppingType)) {
            supplier = SUPPLIERS.get(toppingType);
        } else {
            if (toppingType == ToppingType.CHOCOLATE) {
                supplier = new ChocolateSupplier();
            } else {
                supplier = new SoySupplier();
            }
            SUPPLIERS.put(toppingType, supplier);
        }

        return supplier;
    }
}

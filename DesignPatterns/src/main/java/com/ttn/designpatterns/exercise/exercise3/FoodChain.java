package com.ttn.designpatterns.exercise.exercise3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FoodChain {

    public Coffee order(List<ToppingType> toppingTypes) {

        Coffee coffee = new BasicCoffee();
        coffee = addToppings(coffee, toppingTypes);

        return coffee;
    }

    private Coffee addToppings(Coffee coffee, List<ToppingType> toppingTypes) {

        if (toppingTypes != null && !toppingTypes.isEmpty()) {

            Set<ToppingType> toppingTypesSet = new HashSet<ToppingType>(toppingTypes);
            for (ToppingType toppingType : toppingTypesSet) {

                Supplier supplier = SupplierFlyweightFactory.getSupplier(toppingType);
                coffee = supplier.supply(coffee);
            }
        }

        return coffee;
    }
}

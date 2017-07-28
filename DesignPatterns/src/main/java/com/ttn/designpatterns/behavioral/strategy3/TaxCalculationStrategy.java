package com.ttn.designpatterns.behavioral.strategy3;

/**
 * Created by intelligrape on 29/7/17.
 */
public enum TaxCalculationStrategy implements ITaxCalculator {
    DEFAULT_STRATEGY {
        public void calculateTax() {
            System.out.println("You are applying default tax calculation strategy");
        }
    },
    APPLY_TAX_ON_PURCHASE_PRICE {
        public void calculateTax() {
            System.out.println("You are applying tax on purchase price");
        }
    },
    APPLY_TAX_ON_SELLING_PRICE {
        public void calculateTax() {
            System.out.println("You are applying tax on selling price");
        }
    },
    APPLY_TAX_AFTER_DISCOUNT_CALCULATION {
        public void calculateTax() {
            System.out.println("You are applying tax on discounted price");
        }
    },
    APPLY_TAX_BEFORE_DISCOUNT_CALCULATION {
        public void calculateTax() {
            System.out.println("You are applying tax on amount obtained before tax calculation");
        }
    };

    public static ITaxCalculator getStrategyInstance(Integer ordinal) {
        ITaxCalculator strategy = DEFAULT_STRATEGY;
        for (TaxCalculationStrategy taxCalculationStrategy : values()) {
            if (taxCalculationStrategy.ordinal() == ordinal) {
                strategy = taxCalculationStrategy;
            }
        }
        return strategy;
    }
}

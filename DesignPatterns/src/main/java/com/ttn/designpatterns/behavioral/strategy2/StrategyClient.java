package com.ttn.designpatterns.behavioral.strategy2;

import java.util.Scanner;

public class StrategyClient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer currentInput = 0;
        while (true) {
            System.out.println("Please enter your tax calculation strategy..");
            currentInput = s.nextInt();
            TaxCalculationStrategy taxCalculationStrategy = TaxCalculationStrategy.getStrategyInstance(currentInput);
            taxCalculationStrategy.calculateTax();
        }

    }
}

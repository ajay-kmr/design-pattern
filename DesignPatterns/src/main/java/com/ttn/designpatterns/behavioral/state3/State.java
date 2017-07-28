package com.ttn.designpatterns.behavioral.state3;

import java.util.Scanner;

/**
 * Created by intelligrape on 28/7/17.
 */
public class State {
    Scanner s = new Scanner(System.in);
    Integer currentInput = 0;

    public void takeInput() {
        System.out.println("Please enter coin of Re 1 or Rs 2.. ");
        currentInput = s.nextInt();
        System.out.println("You entered Rs:- " + currentInput);

    }

    public void operate(VendingMachine vendingMachine) {
        vendingMachine.setState(StartState.getInstance());
    }
}

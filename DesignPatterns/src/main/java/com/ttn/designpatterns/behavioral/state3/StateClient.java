package com.ttn.designpatterns.behavioral.state3;

import java.io.IOException;

/**
 * Created by intelligrape on 28/7/17.
 */
public class StateClient {
    public static void main(String[] args) throws IOException {
        VendingMachine vendingMachine = new VendingMachine();
        while (true) {
            vendingMachine.operate();
        }
    }
}

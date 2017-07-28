package com.ttn.designpatterns.behavioral.state2.after;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by intelligrape on 28/7/17.
 */
public class StateClient {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        Chain chain = new Chain();
        while (true) {
            System.out.print("Press 'Enter'");
            is.read();
            chain.pull();
        }
    }
}

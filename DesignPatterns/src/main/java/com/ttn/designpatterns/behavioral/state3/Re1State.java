package com.ttn.designpatterns.behavioral.state3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Re1State extends State {

    private static final Re1State RE_1_STATE = new Re1State();

    private Re1State() {
    }

    public static Re1State getInstance() {
        return RE_1_STATE;
    }

    @Override
    public void operate(VendingMachine vendingMachine) {
        takeInput();
        switch (currentInput) {
            case 1:
                vendingMachine.setState(Re2State.getInstance());
                break;
            case 2:
                vendingMachine.setState(Re3State.getInstance());
                break;
            default:
                System.out.println("Invalid coin.. Please enter coin of Re 1 or Rs 2.. ");
        }
    }
}

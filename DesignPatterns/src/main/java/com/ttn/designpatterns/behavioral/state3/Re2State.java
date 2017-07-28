package com.ttn.designpatterns.behavioral.state3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Re2State extends State {

    private static final Re2State RE_2_STATE = new Re2State();

    private Re2State() {
    }

    public static Re2State getInstance() {
        return RE_2_STATE;
    }


    @Override
    public void operate(VendingMachine vendingMachine) {
        takeInput();
        switch (currentInput) {
            case 1:
                vendingMachine.setState(Re3State.getInstance());
                break;
            case 2:
                vendingMachine.setState(Re4State.getInstance());
                break;
            default:
                System.out.println("Invalid coin.. Please enter coin of Re 1 or Rs 2.. ");
        }
    }
}

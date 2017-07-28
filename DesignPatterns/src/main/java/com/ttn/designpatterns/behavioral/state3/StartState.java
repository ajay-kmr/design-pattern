package com.ttn.designpatterns.behavioral.state3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class StartState extends State {
    private static final StartState START_STATE = new StartState();

    private StartState() {
    }

    public static StartState getInstance() {
        return START_STATE;
    }

    @Override
    public void operate(VendingMachine vendingMachine) {
        takeInput();
        switch (currentInput) {
            case 1:
                vendingMachine.setState(Re1State.getInstance());
                break;
            case 2:
                vendingMachine.setState(Re2State.getInstance());
                break;
            default:
                System.out.println("Invalid coin.. Please enter coin of Re 1 or Rs 2.. ");
        }
    }
}

package com.ttn.designpatterns.behavioral.state3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Re3State extends State {
    private static final Re3State RE_3_STATE = new Re3State();

    private Re3State() {
    }

    public static Re3State getInstance() {
        return RE_3_STATE;
    }


    @Override
    public void operate(VendingMachine vendingMachine) {
        takeInput();
        switch (currentInput) {
            case 1:
                vendingMachine.setState(Re4State.getInstance());
                break;
            case 2:
                System.out.println("Please collect your product..\nThank you for shopping with us..");
                super.operate(vendingMachine);
                break;
            default:
                System.out.println("Invalid coin.. Please enter coin of Re 1 or Rs 2.. ");
        }
    }
}

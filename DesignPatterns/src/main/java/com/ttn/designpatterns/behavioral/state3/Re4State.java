package com.ttn.designpatterns.behavioral.state3;

/**
 * Created by intelligrape on 28/7/17.
 */
public class Re4State extends State {
    private static final Re4State RE_4_STATE = new Re4State();

    private Re4State() {
    }

    public static Re4State getInstance() {
        return RE_4_STATE;
    }


    @Override
    public void operate(VendingMachine vendingMachine) {
        takeInput();
        switch (currentInput) {
            case 1:
                System.out.println("Please collect your product..\n Thank you for shopping with us..");
                break;
            case 2:
                System.out.println("Please collect your product..\nPlease collect your change of Re 1 before leaving the machine.. \nThank you for shopping with us..");
                break;
            default:
                System.out.println("Invalid coin.. Please enter coin of Re 1 or Rs 2.. ");
        }
        super.operate(vendingMachine);
    }
}

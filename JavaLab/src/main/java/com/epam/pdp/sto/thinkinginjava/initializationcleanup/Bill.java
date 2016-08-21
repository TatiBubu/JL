package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/11/2016.
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a message.
 * In main( ), create an object of your class. Explain the behavior of your program.
 */
public class Bill {
    boolean paid = true;

    Bill(boolean payment) {
        paid = payment;
    }

    void pay() {
        paid = true;
    }

    protected void finalizeBill() {
        if (!paid) {
            System.out.println("Error: bill not paid");
        }
    }

    public static void main(String[] args) {
        Bill tea = new Bill(false);
        tea.pay();
        new Bill(false);
        System.gc();

    }
}
/**Output:
 * Error: bill not paid
 */

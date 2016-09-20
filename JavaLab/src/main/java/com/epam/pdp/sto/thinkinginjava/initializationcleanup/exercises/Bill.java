package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/11/2016.
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a message.
 * In main( ), create an object of your class. Explain the behavior of your program.
 */
public class Bill {
    boolean paid = true;

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    Bill(boolean payment, String id) {
        paid = payment;
        this.id = id;
    }

    void pay() {
        paid = true;
    }

    protected void finalize() {
        System.out.println("Releasing bill with id: " + this.id);
        if (!paid) {
            System.out.println("Warn: bill not paid");
        }
    }

    @Override
    public String toString() {
        return "Bill{"
                + "paid="
                + paid
                +  ", id='"
                + id
                + '\''
                + '}';
    }
}
/**Output:
 * Error: bill not paid
 */

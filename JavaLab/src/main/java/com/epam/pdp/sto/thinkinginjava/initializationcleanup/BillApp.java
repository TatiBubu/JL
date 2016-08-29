package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/11/2016.
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a message.
 * In main( ), create an object of your class. Explain the behavior of your program.
 */
public class BillApp {
    Bill bill = new Bill(false, "BillAppInstance");

    public static void main(String[] args) {
        Bill bill = new Bill(false, "4");
        bill.setPaid(true);
        System.out.println(bill);

        BillApp billApp = new BillApp();
        billApp.bill.setPaid(true);
        System.out.println(billApp.toString());
//        BillApp.bill.setPaid(true);
//        System.out.println(BillApp.bill);
//
        //notInitialMethod();
        //System.gc();

    }

    @Override
    public String toString() {
        return "BillApp{"
                + "bill="
                + bill
                + '}';
    }

    private static void notInitialMethod() {
        Bill bill = new Bill(false, "4");
        bill.setPaid(true);
        initialMethod();

    }

    private static void initialMethod() {
        new Bill(false, "3");

        Bill tea = new Bill(false, "1");
        tea.pay();
        new Bill(false, "2");
    }
}
/**Output:
 * Error: bill not paid
 */

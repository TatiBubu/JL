package com.epam.pdp.sto.thinkinginjava.accesscontrol;

import com.epam.pdp.sto.thinkinginjava.accesscontrol.ConnectionManager;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 *  * Exercise 8: (4) Following the form of the example Lunch.java,
 * create a class called ConnectionManager that manages a fixed array of Connection objects.
 * The client programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager.
 * When the ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
 */
public class ConnectionManagerApp {
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        cm.getConnection();
        cm.getConnection();
        cm.getConnection();
        cm.getConnection();

    }
}

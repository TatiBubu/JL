package com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * This is help class to resolve Ex8;
 * Follow public class ConnectionManagerApp for full solution.
 */
class Connection {
    private Connection() {
        System.out.println("Connection");
    }
    //allow creation via static method:

    public static Connection makeConnection() {
        return new Connection();
    }

    public String toString() {
        return ("Connection");
    }
}


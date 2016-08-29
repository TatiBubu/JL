package com.epam.pdp.sto.thinkinginjava.accesscontrol;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
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


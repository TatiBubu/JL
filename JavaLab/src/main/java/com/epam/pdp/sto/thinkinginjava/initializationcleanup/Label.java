package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/15/2016.
 */
class Label {
    static String name;

    static String country;

    static {
        name = "HOSPITAL RECORDS";
        country = "UK";
    }

    Label() {
        System.out.println("Label");
    }

    void printStaticBlock() {
        System.out.println("default static block String name and country are: " + name + ";" + country);
    }
}

package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/15/2016.
 * This class helps to resolve Ex14, pls follow it for full solution
 * Label is a class with a static String field that is initialized by the static block
 */
class Label {
    //String fields:
    static String name;

    static String country;
//initialized by the static block:
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

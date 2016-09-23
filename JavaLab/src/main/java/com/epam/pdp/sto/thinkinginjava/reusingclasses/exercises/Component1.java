package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Add for Ex9: All classes should have default constructors that print a message about that class.
 */
public class Component1 {
    Component1() {
        System.out.println(" Component1()");
    }

    void dispose() {
        System.out.println("Component1.dispose()");
    }
}



package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Add for Ex9: All classes should have default constructors that print a message about that class.
 */

public class Component2 {
    Component2() {
        System.out.println(" Component2()");
    }

    void dispose() {
        System.out.println("Component2.dispose()");
    }
}

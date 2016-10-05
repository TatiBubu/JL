package com.epam.pdp.sto.thinkinginjava.innerclasses.exercises;

/**
 * additional class for Ex1
 */
public class Outer {
    class Inner {
        Inner() {
            System.out.println("Inner()");
        }
    }

    public Inner returnInner() {
        return new Inner();
    }
}

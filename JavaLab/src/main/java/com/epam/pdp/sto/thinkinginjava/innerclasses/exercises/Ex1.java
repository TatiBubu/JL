package com.epam.pdp.sto.thinkinginjava.innerclasses.exercises;

/**
 * Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
 * Add a method to Outer that returns an object of type Inner. In main( ),
 * create and initialize a reference to an Inner.
 */
public class Ex1 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inn = out.returnInner();
    }
}
/**Output:
 * Inner()
 */

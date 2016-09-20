package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/8/2016.
 * Exercise 1: (1) Create a class containing an uninitialized String reference.
 * Demonstrate that this reference is initialized by Java to null.
 */

public class UninitializedTest {
    public static void main(String[] args) {
        Simple test = new Simple();
        System.out.println(test.s);
    }
}
/* Output:
null
 */

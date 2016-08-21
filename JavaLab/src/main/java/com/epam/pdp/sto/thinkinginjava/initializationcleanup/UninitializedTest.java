package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/8/2016.
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

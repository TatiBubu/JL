package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Best on 14.08.2016.
 * Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax.
 * Print all the elements in the resulting args array.
 * Test it with various numbers of command-line arguments.
 */
public class Ex20 {
    public static void main(String... args) {
        for (String s : args) {
            System.out.println(s + " ");
            System.out.println();
        }
    }
}
package com.epam.pdp.sto.thinkinginjava.everythingisanobject.exercises;

/**
 * Exercise 1: (2) Create a class containing an int and a char that are not initialized,
 * and print their values to verify that Java performs default initialization.
 */

public class Ex1 {
    private static int anInt;

    private static String aString;

    public static void main(String[] args) {
        System.out.println(anInt);
        System.out.println(aString);
    }
}

/** Output:
 * 0
 null
 */

package com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/22/2016.
 * Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method.
 * The first version displays its String argument to the console, the second does nothing.
 * Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
 */

public class Ex3Test {
    public static void main(String[] args) {
        com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises.debug.Ex3 test =
                new com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises.debug.Ex3();
     test.debug("debugEx3Instance");

    }
}

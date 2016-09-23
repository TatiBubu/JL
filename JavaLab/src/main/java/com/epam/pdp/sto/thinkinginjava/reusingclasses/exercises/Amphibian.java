package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 16: (2) Create a class called Amphibian.
 */
public class Amphibian {

    protected void breath() {
        System.out.println("breate()");
    }

    static void live(Amphibian am) {
        am.breath();
    }
}

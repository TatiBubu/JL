package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 16: (2) Create a class called Amphibian.
 * From this, inherit a class called Frog.
 * Put appropriate methods in the base class.
 * In main( ), create a Frog and upcast it to Amphibian and
 * demonstrate that all the methods still work.
 */
public class Ex16 {
    public static void main(String[] args) {
        Frog fr = new Frog();
        Amphibian.live(fr);
    }
}
/**Output:
 * breate()
 */


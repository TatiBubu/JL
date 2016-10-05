package com.epam.pdp.sto.thinkinginjava.innerclasses.exercises;

/**
 * Exercise 5: (1) Create a class with an inner class.
 * (Previously created class Outer with inner class Inner used.)
 * In a separate class, make an instance of the inner class.
 */
public class Ex5 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();
        System.out.println(inn);
    }
}
/**Output:
 * Inner()
 com.epam.pdp.sto.thinkinginjava.innerclasses.exercises.Outer$Inner@1b6d3586
 */

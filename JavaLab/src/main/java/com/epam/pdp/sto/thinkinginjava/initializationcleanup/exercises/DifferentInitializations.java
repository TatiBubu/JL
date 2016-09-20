package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/9/2016.
 * Exercise 2: (2) Create a class with a String field that is initialized at the point of definition,
 * and another one that is initialized by the constructor.
 * What is the difference between the two approaches?
 */
public class DifferentInitializations {
    public static void main(String[] args) {
        TestInit variable = new TestInit(" ");
        System.out.println("variable.s1 = " + variable.s1);
        System.out.println("variable.s2 = " + variable.s2);
    }
}
/*Output:
variable.s1 = s1
variable.s2 = null
 */

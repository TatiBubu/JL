package com.epam.pdp.sto.thinkinginjava.operators.exercises;

/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says.
 * Follow Ex5 to see how Dog is used.
 */
public class Dog {
    private String name;

    private String says;

    Dog(String name, String says)  {
        this.name = name;
        this.says = says;
        System.out.println("Dog "
        + name
        + " says "
        + says
        + "; ");
    }
}

package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;

/**
 * Exercise 4: (2) Add a new type of Shape to Shapes.java
 * and verify in main( ) that polymorphism works for your new type as it does in the old types.
 */
public class Fractus extends Shape {
    public void draw() {
        System.out.println("Fractus.draw()");
    }

    public void erase() {
        System.out.println("Fractus.erase()");
    }
}

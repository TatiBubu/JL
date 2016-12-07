package com.epam.pdp.sto.thinkinginjava.polymorph;
/** Exercise 2: (1) Add the @Override annotation to the shapes example.
// * Exercise 4: (2) Add a new type of Shape to Shapes.java and
// verify in main( ) that polymorphism works for your new type as it does in the old types.
 */


public class Circle extends Shape {
    public Circle() {
        System.out.println("Circle()");
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

package com.epam.pdp.sto.thinkinginjava.polymorph;
/** Exercise 2: (1) Add the @Override annotation to the shapes example.
// * public class Circle extends Shape {
// * @Override public void draw() {
// * System.out.println("Circle.draw()"); }
// * @Override public void erase() { System.out.println("Circle.erase()"); }
// * }
// * Exercise 4: (2) Add a new type of Shape to Shapes.java and
// verify in main( ) that polymorphism works for your new type as it does in the old types.
 */
import java.util.Random;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.


//** Output:
//        Triangle.draw()
//        Square.draw()
//        Triangle.draw()
//        Fractus.draw()
//        Fractus.draw()
//        Triangle.draw()
//        Fractus.draw()
//        Square.draw()
//        Triangle.draw()
//        Overridden Triangle()
//        Not Overridden
//        Overridden Triangle()
//        Not Overridden
//        Not Overridden
//        Overridden Triangle()
//        Not Overridden
//        Not Overridden
//        Overridden Triangle()
//
//        Process finished with exit code 0




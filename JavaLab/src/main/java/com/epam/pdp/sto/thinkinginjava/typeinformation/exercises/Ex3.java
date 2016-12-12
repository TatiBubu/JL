package com.epam.pdp.sto.thinkinginjava.typeinformation.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Circle;
import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 3: (2) Add Rhomboid to Shapes.java.
 * Create a Rhomboid, upcast it to a Shape, then downcast it back to a Rhomboid.
 * Try downcasting to a Circle and see what happens.
 */
public class Ex3 {
    public static void main(String[] args) {
        Shape rhomb = new Rhomboid();
        List<Shape> shapes = Arrays.asList(rhomb, new Circle());
        for (Shape shape : shapes) {
            shape.draw();
        }
        ((Rhomboid)rhomb).draw();

        //Following downcasting cannot be resolved:
       // ((Circle)rhomb).draw();
    }
}
/**Output:
 * Rhomboid()
 Circle()
 Rhomboid.draw()
 Circle.draw()
 Rhomboid.draw()
*/

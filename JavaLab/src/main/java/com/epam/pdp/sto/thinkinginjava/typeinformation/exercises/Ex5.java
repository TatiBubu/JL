package com.epam.pdp.sto.thinkinginjava.typeinformation.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Circle;
import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;
import sun.security.provider.SHA;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 5: (3) Implement a rotate(Shape) method in Shapes.java,
 * such that it checks to see if it is rotating a Circle (and, if so, doesn’t perform the operation).
 */
public class Ex5 {
    public static void rotate(Shape sha) {
        if (!(sha instanceof Circle)) {
            System.out.println("rotate(" + sha + ");");
        } else {
            System.out.println("no purpose to rotate a Circle");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Rhomboid(), new Circle());
        for (Shape shape : shapes) {
            rotate(shape);
        }
    }
}
/**Output:
 * Rhomboid()
 Circle()
 rotate(Rhomboid);
 no purpose to rotate a Circle
 */


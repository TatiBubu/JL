package com.epam.pdp.sto.thinkinginjava.typeinformation.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Circle;
import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 4: (2) Modify the previous exercise
 * so that it uses instanceof to check the type before performing the downcast.
 */
public class Ex4 {
    public static void main(String[] args) {
        Rhomboid rhomb = new Rhomboid();
        List<Shape> shapes = Arrays.asList(rhomb, new Circle());
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle)shape).draw();
            } else {
                System.out.println("shape is not Circle");
            }
        }
    }
}
/**Output:
 Rhomboid()
 Circle()
 shape is not Circle
 Circle.draw()
 */

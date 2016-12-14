package com.epam.pdp.sto.thinkinginjava.typeinformation.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Circle;
import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise 6: (4) Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of a particular type.
 * The toString( ) method for each derived Shape should indicate whether that Shape is "highlighted."
 */
public class Ex6 {
    public static void setHighlightFlag(Shape sha) {
        if (sha instanceof Rhomboid) {
            sha.highlightFlag = true;
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Rhomboid(), new Circle());
        for (Shape shape : shapes) {
            setHighlightFlag(shape);
            System.out.println(shape);
        }

    }
}
/**Output:
 * Rhomboid()
 Circle()
 Object of class com.epam.pdp.sto.thinkinginjava.typeinformation.exercises.Rhomboid is highlighted
 Object of class com.epam.pdp.sto.thinkinginjava.polymorph.Circle is unhighlighted
 */

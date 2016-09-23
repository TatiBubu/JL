package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.RandomShapeGenerator;
import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    /* @Override void draw() {
         System.out.println("Overriden");
     } */
    public static void main(String[] args) {
        Shape[] shape = new Shape[9];
// Fill up the array with shapes:
        for (int i = 0; i < shape.length; i++) {
            shape[i] = gen.next();
        }
// Make polymorphic method calls:
        for (Shape shp : shape) {
            shp.draw();
        }
        for (Shape shp : shape) {
            shp.printMsg();
        }
    }
}
/**Output:
 * Triangle.draw()
 Square.draw()
 Triangle.draw()
 Fractus.draw()
 Fractus.draw()
 Triangle.draw()
 Fractus.draw()
 Square.draw()
 Triangle.draw()
 Overridden Triangle()
 Not Overridden
 Overridden Triangle()
 Not Overridden
 Not Overridden
 Overridden Triangle()
 Not Overridden
 Not Overridden
 Overridden Triangle()
 */

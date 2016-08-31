package com.epam.pdp.sto.thinkinginjava.polymorph;

class Shapes {
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

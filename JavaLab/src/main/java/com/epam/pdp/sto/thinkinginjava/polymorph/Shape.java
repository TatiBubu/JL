package com.epam.pdp.sto.thinkinginjava.polymorph;

public class Shape {
    public void draw() {}

    public void erase() {}

    public void printMsg() {
        System.out.println("Not Overridden");
    }
}
////** Output:
//Triangle.draw()
//        Triangle.draw()
//        Square.draw()
//        Triangle.draw()
//        Square.draw()
//        Triangle.draw()
//        Square.draw()
//        Triangle.draw()
//        Circle.draw()
//        Overridden Triangle()
//        Overridden Triangle()
//        Not Overridden
//        Overridden Triangle()
//        Not Overridden
//        Overridden Triangle()
//        Not Overridden
//        Overridden Triangle()
//        Not Overridden


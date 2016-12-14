package com.epam.pdp.sto.thinkinginjava.polymorph;

public class Shape {
    public boolean highlightFlag;

    public void draw() {}

    public void erase() {}

    public void printMsg() {
        System.out.println("Not Overridden");
    }

    public String toString() {
        return "Object of " + this.getClass() + " is " + (highlightFlag ? "highlighted" : "unhighlighted");
    }
}

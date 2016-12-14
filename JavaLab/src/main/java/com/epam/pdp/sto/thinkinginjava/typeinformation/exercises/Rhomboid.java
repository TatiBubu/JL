package com.epam.pdp.sto.thinkinginjava.typeinformation.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Shape;

/**
 * Created by Best on 08.12.2016.
 */
public class Rhomboid extends Shape {
    boolean highlightFlag = false;

    Rhomboid() {
        System.out.println("Rhomboid()");
    }

    @Override
    public void draw() {
        System.out.println("Rhomboid.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rhomboid.erase()");
    }

    public void printMsg() {
        System.out.println("Rhomboid Triangle()");
    }

//    public String toString(){
//        return "Rhomboid is " + (highlightFlag ? "highlighted": "unhighlighted");
//    }

}

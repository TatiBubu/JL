package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 * Exercise 9: (3) Create an inheritance hierarchy of Rodent:
 * Mouse, Gerbil, Hamster, etc. In the base class, provide methods that are common to all Rodents,
 * and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
 * Create an array of Rodent, fill it with different specific types of Rodents,
 * and call your base-class methods to see what happens.
 */
public class Rodent {
    public void cave() {
        System.out.println("Rodent is caving");
    }

    public void jump() {
        System.out.println("Rodent is jumping");
    }

    public String toString() {
       return "Rodent";
    }
}




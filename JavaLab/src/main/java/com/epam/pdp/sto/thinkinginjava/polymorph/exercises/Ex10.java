package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 * Exercise 10: (3) Create a base class with two methods. In the first method, call the second method.
 * Inherit a class and override the second method.
 * Create an object of the derived class, upcast it to the base type, and call the first method. Explain what happens.
 */

public class Ex10 {
    public static void main() {
        Base test = new SubBase();
        test.method1();
    }
}

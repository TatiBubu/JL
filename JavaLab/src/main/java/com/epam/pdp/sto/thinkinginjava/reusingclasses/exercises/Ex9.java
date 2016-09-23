package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 9: (2) Create a class called Root that contains an instance of each of the classes (that you also create)
 * named Component1, Component2, and Component3. Derive a class Stem from Root that also contains an instance
 * of each “component.”
 * All classes should have default constructors that print a message about that class.
 */
public class Ex9 {
    public static void main(String[] args) {
        Stem st = new Stem();
    }
}
/**Output:
 *  Component1()
 Component2()
 Component3()
 Root()
 Component1()
 Component2()
 Component3()
 Stem()
 */


package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

/**
 * Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization
 * of the base classes and derived classes. Now add member objects to both
 * the base and derived classes and show the order in which their initialization occurs during construction.
 * Additional class Characteristic is added;
 * instances of Characteristic added to Rodent and  Gerbil
 */
public class Ex12 {
    public static void main(String[] args) {
        Gerbil gerb = new Gerbil();
    }
}
/**Output:
 * Creating Characteristic beautiful
 Rodent()
 Creating Characteristic nice
 Gerbil()
 */



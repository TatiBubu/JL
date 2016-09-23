package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Add to Ex9:
 * Derive a class Stem from Root that also contains an instance of each “component.”
 */
public class Stem extends Root{
    Stem() {
        System.out.println("Stem()");
    }

    Component1 c1 = new Component1();

    Component2 c2 = new Component2();

    Component3 c3 = new Component3();

    void dispose() {
        super.dispose();
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("Stem.dispose()");
    }

}



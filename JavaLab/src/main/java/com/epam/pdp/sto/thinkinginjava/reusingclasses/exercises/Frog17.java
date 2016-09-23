package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * ADD to EX17: Frog17 overrides the method definitions from the base class
 */
public class Frog17 extends  Amphibian{

    protected void breath() {
        super.breath();
        System.out.println("overriden method breath() ");
    }
}

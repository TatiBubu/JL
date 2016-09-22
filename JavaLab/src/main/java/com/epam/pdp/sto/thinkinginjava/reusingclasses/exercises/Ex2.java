package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

import com.epam.pdp.sto.thinkinginjava.reusingclasses.Detergent;

/**
 * Exercise 2: (2) Inherit a new class from class Detergent.
 * Override scrub( ) and add a new method called sterilize( ).
 */
public class Ex2 extends Detergent {
    @Override
    public void scrub() {
        append("Ex2.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append("Ex2.sterilize()");
    }

    public static void main(String[] args) {
        Ex2 elem = new Ex2();
        elem.scrub();
        elem.sterilize();
        elem.append("some");
        elem.apply();
        Detergent.main(args);
    }
}


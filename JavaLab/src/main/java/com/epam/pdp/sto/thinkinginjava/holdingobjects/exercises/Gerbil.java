package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.ArrayList;

/**
 * Exercise 1 addtional class
 */

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("hop() returns gerbilNumber = "
                + gerbilNumber);
    }
}



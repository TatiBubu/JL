package com.epam.pdp.sto.thinkinginjava.arrays;

/**
 * Created by Tetyana_Stolyarova on 12/9/2016.
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}


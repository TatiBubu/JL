package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/15/2016.
 * Exercise 2: (2) Create a class with a String field that is initialized at the point of definition,
 * and another one that is initialized by the constructor.
 * For the difference follow DifferentInitializations.
 */
public class TestInit {
    String s1 = "s1";
    String s2 = "s3";

    TestInit(String s2) {
        this.s2 = s2;
    }
}

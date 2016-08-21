package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/11/2016.
 * Exercise 8: (1) Create a class with two methods.
 * Within the first method, call the second method twice:
 * the first time without using this, and the second time using this—just to see it working;
 * you should not use this form in practice.
 */
public class MethodCalledThis {
    void first() {
        second();
        this.second();
    }

    void second() {}

}

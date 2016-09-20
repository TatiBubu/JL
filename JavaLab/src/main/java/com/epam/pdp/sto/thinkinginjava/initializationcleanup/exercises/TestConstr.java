package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/9/2016.
 * Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message.
 * Create an object of this class.
 */
public class TestConstr {
    TestConstr() {
        System.out.println("Message");
    }

    public static void main(String[] args) {
        TestConstr test = new TestConstr();
    }
}
/*Output:
Message
 */

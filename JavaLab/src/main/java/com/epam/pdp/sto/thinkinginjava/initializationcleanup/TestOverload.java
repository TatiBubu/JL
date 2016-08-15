package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/9/2016.
 * Exercise 4: (1) Add an overloaded constructor to the previous exercise
 * that takes a String argument and prints it along with your message.
 */
public class TestOverload {
    TestOverload() {
        System.out.println("Message");
    }

    TestOverload(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        TestOverload test = new TestOverload("overloaded constructor");
    }
}
/** Output:
* Message: overloaded constructor
*/

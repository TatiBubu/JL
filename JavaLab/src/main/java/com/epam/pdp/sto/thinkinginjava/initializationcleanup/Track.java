package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Best on 14.08.2016.
 * Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition,
 * and another one that is initialized by the static block.
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 */

class Track {
    static String genre;

    void printGenre() {
        System.out.println("default static String genre is: " + genre);
    }

    Track() {
        System.out.println("Track");
    }
}





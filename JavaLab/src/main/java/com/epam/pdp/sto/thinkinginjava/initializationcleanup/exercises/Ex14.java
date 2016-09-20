package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Best on 14.08.2016.
 * Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition,
 * and another one that is initialized by the static block.
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 * helpful classes used here: Track, Label
 */

class Ex14 {
    public static void main(String[] args) {
        Track track = new Track();
        Label label = new Label();
        track.printGenre();
        label.printStaticBlock();
    }
}

/*Output:
Track
Label
default static String genre is: null
default static block String name and country are: HOSPITAL RECORDS;UK
 */

package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Best on 14.08.2016.
 * Additional fo resolving Ex14;
 * class with a static String field that is initialized at the point of definition
 */

class Track {
    static String genre = "Drum&Base";

    void printGenre() {
        System.out.println("genre is: " + genre);
    }

    Track() {
        System.out.println("Track");
    }
}





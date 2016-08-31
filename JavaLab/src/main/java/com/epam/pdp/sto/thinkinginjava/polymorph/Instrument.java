package com.epam.pdp.sto.thinkinginjava.polymorph;

//Exercise 6: (1) Change Music3.java so that what( )
//        * becomes the root Object method toString( ).
//        * Try printing the Instrument objects using System.out.println( ) (without any casting).

public class Instrument {
    void play(Note note) {
        System.out.println("Instrument.play() " + note);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

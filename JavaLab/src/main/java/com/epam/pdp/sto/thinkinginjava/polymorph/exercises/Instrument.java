package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

//Exercise 6: (1) Change Music3.java so that what( )
//        * becomes the root Object method toString( ).
//        * Try printing the Instrument objects using System.out.println( ) (without any casting).

import com.epam.pdp.sto.thinkinginjava.polymorph.Note;

public class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play() " + note);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

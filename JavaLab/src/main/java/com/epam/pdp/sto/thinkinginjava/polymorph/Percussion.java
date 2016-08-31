package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
class Percussion extends Instrument {
    void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    public String toString() {

        return "Percussion";
    }

    void adjust() {

        System.out.println("Adjusting Percussion");
    }
}

package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Instrument;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
public class Percussion extends Instrument {
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    public String toString() {

        return "Percussion";
    }

    void adjust() {

        System.out.println("Adjusting Percussion");
    }
}

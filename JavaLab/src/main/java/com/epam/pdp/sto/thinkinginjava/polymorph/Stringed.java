package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Instrument;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
public class Stringed extends Instrument {
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

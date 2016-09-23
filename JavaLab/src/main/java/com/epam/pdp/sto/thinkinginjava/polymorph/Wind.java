package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Instrument;

public class Wind extends Instrument {

    public void play(Note note) {

        System.out.println("Wind.play() " + note);
    }

    public String toString() {

        return "Percussion";
    }

    void adjust() {

        System.out.println("Adjusting Wind");
    }
}






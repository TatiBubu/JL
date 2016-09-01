package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
class Stringed extends Instrument {
    void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

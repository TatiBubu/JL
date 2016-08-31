package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
class Brass extends Wind {
    void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

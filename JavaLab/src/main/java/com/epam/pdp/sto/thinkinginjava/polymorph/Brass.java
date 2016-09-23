package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.Note;
import com.epam.pdp.sto.thinkinginjava.polymorph.Wind;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
public class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

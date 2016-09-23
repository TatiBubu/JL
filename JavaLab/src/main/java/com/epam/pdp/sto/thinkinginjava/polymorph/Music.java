package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Instrument;

public class Music {
    public static void tune(Instrument instrument) {
// ...
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}

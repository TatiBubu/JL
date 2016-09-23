package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.Note;
import com.epam.pdp.sto.thinkinginjava.polymorph.RandonInstrumentGeneration;

/**
 * Created by Best on 30.08.2016.
 * Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
 */

public class Music3Ex8 {

    public static void tune(Instrument instrument) {
// ...
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] elem) {
        for (Instrument instr : elem) {
            tune(instr);
        }
    }

    public static void main(String[] args) {
        RandonInstrumentGeneration gen = new RandonInstrumentGeneration();

        Instrument[] instrumentArr = new Instrument[10];
// Fill up the array with instruments:

        for (int i = 0; i < instrumentArr.length; i++) {
            instrumentArr[i] = gen.next();
        }
// Make polymorphic method calls:
        for (Instrument instr : instrumentArr) {
            instr.play(Note.B_FLAT);
        }
        for (Instrument instr : instrumentArr) {
            instr.toString();
        }
    }
}

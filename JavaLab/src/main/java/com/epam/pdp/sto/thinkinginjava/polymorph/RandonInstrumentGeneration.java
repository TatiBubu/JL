package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Drums;
import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Instrument;

import java.util.Random;

public class RandonInstrumentGeneration {
    Random rand = new Random(49);

    public Instrument next() {
        switch (rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return  new Brass();
            case 4: return  new Woodwind();
            case 5: return  new Drums();

        }
    }
}

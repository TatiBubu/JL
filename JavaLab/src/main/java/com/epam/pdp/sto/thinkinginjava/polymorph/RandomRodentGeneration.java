package com.epam.pdp.sto.thinkinginjava.polymorph;

import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Gerbil;
import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Hamster;
import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Mouse;
import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Rodent;

import java.util.Random;

public class RandomRodentGeneration {

    Random rand = new Random(49);

    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Gerbil();
        }
    }
}

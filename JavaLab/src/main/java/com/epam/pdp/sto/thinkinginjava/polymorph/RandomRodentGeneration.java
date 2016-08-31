package com.epam.pdp.sto.thinkinginjava.polymorph;

import java.util.Random;

class RandomRodentGeneration {

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

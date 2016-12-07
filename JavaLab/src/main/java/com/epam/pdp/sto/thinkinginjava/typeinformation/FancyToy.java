package com.epam.pdp.sto.thinkinginjava.typeinformation;

/**
 * Created by Best on 07.12.2016.
 */
class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

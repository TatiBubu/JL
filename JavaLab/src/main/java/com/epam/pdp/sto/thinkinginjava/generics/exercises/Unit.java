package com.epam.pdp.sto.thinkinginjava.generics.exercises;


import com.epam.pdp.sto.thinkinginjava.generics.Generators;

import java.util.ArrayList;

/**
 * additionl for Ex19;
 */
public class Unit extends ArrayList<Container> {
    public Unit(int numCont) {
        Generators.fill(this, Container.generator, numCont);
    }
}


package com.epam.pdp.sto.thinkinginjava.generics.exercises;

import com.epam.pdp.sto.thinkinginjava.generics.Generator;

import java.util.Random;

/**
 * additionl for Ex19;
 */
class Container {
    private final int id;
    private String description;
    private double volume;

    public Container(int id, String description, double volume) {
        this.id = id;
        this.description = description;
        this.volume = volume;
        System.out.println(toString());
    }

    public String toString() {
        return id + ": " + description + ". volume: m3 " + volume;
    }

    public void containerAdd(double addVolume) {
        volume += addVolume;
    }

    public static Generator<Container> generator =
            new Generator<Container>() {
               private Random rand = new Random(47);
                public Container next() {
                    return new Container(rand.nextInt(1000), "container added",
                            Math.round(rand.nextDouble() * 100.00) + 0.99);
                }
            };

}

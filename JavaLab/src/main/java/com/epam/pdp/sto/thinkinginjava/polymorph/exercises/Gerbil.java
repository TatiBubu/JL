package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

public class Gerbil extends Rodent {
    public Characteristic ch = new Characteristic("nice");

    public Gerbil() {
        System.out.println("Gerbil()");
    }

    @Override public void jump() {
        System.out.println("Gerbil is jumping");
    }

    @Override public void cave() {
        System.out.println("Overriden Gerbil cave");
    }
}



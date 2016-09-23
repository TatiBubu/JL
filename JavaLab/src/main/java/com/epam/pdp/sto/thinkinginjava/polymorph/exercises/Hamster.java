package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;


public class Hamster extends Rodent {
    @Override public void jump() {
        System.out.println("Hamster is jumping");
    }

    @Override public void cave() {
        System.out.println("Overriden Hamster cave");
    }
}



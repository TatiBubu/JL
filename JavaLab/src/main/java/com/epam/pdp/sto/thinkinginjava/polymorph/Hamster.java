package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
public class Hamster extends Rodent {
    @Override public void jump() {
        System.out.println("Hamster is jumping");
    }

    @Override public void cave() {
        System.out.println("Overriden Hamster cave");
    }
}

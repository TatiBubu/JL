package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
//public class Hamster extends Rodent {
//    @Override public void jump() {
//        System.out.println("Hamster is jumping");
//    }
//
//    @Override public void cave() {
//        System.out.println("Overriden Hamster cave");
//    }
//}

/* Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter
* so that Rodent is an interface.
 */
public class Hamster implements Rodent {

    public void jump() {
        System.out.println("Hamster is jumping");
    }

    public void cave() {
        System.out.println("Overriden Hamster cave");
   }
}


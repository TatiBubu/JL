package com.epam.pdp.sto.thinkinginjava.interfaces.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
//public class Gerbil extends Rodent {
//    @Override public void jump() {
//        System.out.println("Gerbil is jumping");
//    }
//
//    @Override public void cave() {
//        System.out.println("Overriden Gerbil cave");
//    }
//}

public class Gerbil implements Rodent1 {
     public void jump() {
        System.out.println("Gerbil is jumping");
    }

     public void cave() {
        System.out.println("Overriden Gerbil cave");
    }
}


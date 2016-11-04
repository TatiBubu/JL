package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.ArrayList;

/**
 * Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber
 * that’s initialized in the constructor. Give it a method called hop( )
 * that displays which gerbil number this is, and that it’s hopping.
 * Create an ArrayList and add Gerbil objects to the List. Now use the get( )
 * method to move through the List and call hop( ) for each Gerbil.
 *
 */
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbil = new ArrayList<>();
        for (int it = 0; it < 4; it++) {
            gerbil.add(new Gerbil(it));
        }

        for (int it = 0; it < gerbil.size(); it++) {
            gerbil.get(it).hop();
        }

        for (Gerbil gerb : gerbil) {
            gerb.hop();
        }
    }
}
/**Output:
 hop() returns gerbilNumber = 0
 hop() returns gerbilNumber = 1
 hop() returns gerbilNumber = 2
 hop() returns gerbilNumber = 3
 hop() returns gerbilNumber = 0
 hop() returns gerbilNumber = 1
 hop() returns gerbilNumber = 2
 hop() returns gerbilNumber = 3
 */

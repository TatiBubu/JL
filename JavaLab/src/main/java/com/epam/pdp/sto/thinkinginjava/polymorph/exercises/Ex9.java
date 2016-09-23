package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

import com.epam.pdp.sto.thinkinginjava.polymorph.RandomRodentGeneration;

/**
 * Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class,
 * provide methods that are common to all Rodents, and override these in the derived classes to perform different
 * behaviors depending on the specific type of Rodent. Create an array of Rodent,
 * fill it with different specific types of Rodents, and call your base-class methods to see what happens.
 */

public class Ex9 {
    public static void main(String[] args) {
        RandomRodentGeneration gen = new RandomRodentGeneration();
        Rodent[] rodentArr = new Rodent[5];
// Fill up the array with rodents:
        for (int i = 0; i < rodentArr.length; i++) {
            rodentArr[i] = gen.next();
        }
// Make polymorphic method calls:
        for (Rodent rod : rodentArr) {
            rod.cave();
        }
        for (Rodent rod : rodentArr) {
            System.out.println(rod);
        }
        for (Rodent rod : rodentArr) {
            rod.jump();
        }
    }
}
/** Output:
 * Mouse id caving
 Mouse id caving
 Overriden Gerbil cave
 Overriden Hamster cave
 Mouse id caving
 Mouse
 Mouse
 Rodent
 Rodent
 Mouse
 Mouse Jump()
 Mouse Jump()
 Gerbil is jumping
 Hamster is jumping
 Mouse Jump()
 */







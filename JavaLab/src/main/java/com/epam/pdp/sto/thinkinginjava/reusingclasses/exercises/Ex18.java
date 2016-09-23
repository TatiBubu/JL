package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

import java.util.Random;

/**
 * Exercise 18: (2) Create a class with a static final field
 * and a final field and demonstrate the difference between the two.
 */
public class Ex18 {
    private static Random rand = new Random(23);

    private final int fi = rand.nextInt(20);

    static final int sfi = rand.nextInt(20);

    public static void main(String[] args) {
        Ex18 it1 = new Ex18();
        System.out.println("it1.sfi = "
                + it1.sfi
        + "it1.fi = "
        + it1.fi);

        Ex18 it2 = new Ex18();
        System.out.println("it2.sfi = "
                + it2.sfi
                + "it2.fi = "
                + it2.fi);
    }
}
/**Output:
 * it1.sfi = 7it1.fi = 8
 it2.sfi = 7it2.fi = 3
 */


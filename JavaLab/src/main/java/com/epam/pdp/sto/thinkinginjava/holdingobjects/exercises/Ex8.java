package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Exercise 8: (1) Modify Exercise l so it uses an Iterator to move through
 * the List while calling hop( ).
 */
public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbil = new ArrayList<>();

        for (int ind = 0; ind < 4; ind++) {
            gerbil.add(new Gerbil(ind));
        }

        Iterator<Gerbil> it = gerbil.iterator();

        while (it.hasNext()) {
            Gerbil gerb = it.next();
            gerb.hop();
        }
    }
}
/*Output:
hop() returns gerbilNumber = 0
hop() returns gerbilNumber = 1
hop() returns gerbilNumber = 2
hop() returns gerbilNumber = 3
* */


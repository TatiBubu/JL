package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Exercise 17: (2) Take the Gerbil class in Exercise 1 and put it into
 * a Map instead, associating each Gerbil’s name (e.g. "Fuzzy" or "Spot")
 * as a String (the key) for each Gerbil (the value) you put in the table.
 * Get an Iterator for the keySet( ) and use it to move through the Map,
 * looking up the Gerbil
 * for each key and printing out the key and telling the Gerbil to hop( ).
 */
public class Ex17 {
    public static void main(String[] args) {
        Map<String,Gerbil> gmap = new HashMap<String,Gerbil>();
        gmap.put("Fuzzy", new Gerbil(1));
        gmap.put("Spot", new Gerbil(2));
        gmap.put("Spot", new Gerbil(3));
        gmap.put("Smoozzy", new Gerbil(3));
        System.out.println(gmap);
        System.out.println(gmap.keySet());

        Iterator<String> it = gmap.keySet().iterator();

        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str
                    + ": ");
            gmap.get(str).hop();
        }
    }

}
/**Output:
 * {Spot=exercises.Gerbil@1540e19d, Smoozzy=exercises.Gerbil@677327b6, Fuzzy=exercises.Gerbil@14ae5a5}
 [Spot, Smoozzy, Fuzzy]
 Spot:
 hop() returns gerbilNumber = 3
 Smoozzy:
 hop() returns gerbilNumber = 3
 Fuzzy:
 hop() returns gerbilNumber = 1
 */



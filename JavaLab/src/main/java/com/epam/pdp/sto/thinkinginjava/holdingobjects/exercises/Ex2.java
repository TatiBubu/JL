package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Exercise 2: (1) Modify SimpleCollection.java to use a Set for c.
 */
public class Ex2 {
    public static void main(String[] args) {
        Collection<Integer> col = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            col.add(i); // Autoboxing
        }
        for (Integer it : col) {
            System.out.print(it + ", ");
        }
    }
}
/**Output:
 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
 */

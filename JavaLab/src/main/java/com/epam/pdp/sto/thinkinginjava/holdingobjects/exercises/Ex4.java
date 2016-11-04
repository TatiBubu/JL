package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Exercise 4: (3) Create a generator class that produces character names (as String objects) from your favorite book
 * each time you call next( ), and loops around to the beginning of the character list when it runs out of names.
 * Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet,
 * then print each container.
 */
public class Ex4 {
    public static void main(String[] args) {
        CharactersGenerator gen = new CharactersGenerator();

        String[] arr = new String[10];
        gen.fill(arr);

        for (String str : arr) {
            System.out.println(str
                    + ", ");
        }

        System.out.println(gen.fill(new ArrayList<String>(), 10));
        System.out.println(gen.fill(new LinkedList<String>(), 10));
        System.out.println(gen.fill(new HashSet<String>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gen.fill(new TreeSet<String>(), 10));
    }
}
/**Output:
 Joan,
 Mathey,
 Marco,
 Joan,
 Luca,
 Joan,
 Mathey,
 Marco,
 Joan,
 Luca,
 [Joan, Mathey, Marco, Joan, Luca, Joan, Mathey, Marco, Joan, Luca]
 [Joan, Mathey, Marco, Joan, Luca, Joan, Mathey, Marco, Joan, Luca]
 [Marco, Joan, Luca, Mathey]
 [Joan, Mathey, Marco, Luca]
 [Joan, Luca, Marco, Mathey]
 */


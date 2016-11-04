package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.TreeSet;

/**
 * Exercise 18: (3) Fill a HashMap with key-value pairs.
 * Print the results to show ordering by hash code.
 * Extract the pairs, sort by key, and place the result into a LinkedHashMap.
 * Show that the insertion order is maintained.
 */
public class Ex18 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(2,"two");
        map.put(3,"three");
        map.put(2,"another two");
        map.put(33,"three");
        System.out.println(map);

        Set<Integer> keysSet = new TreeSet<Integer>(map.keySet());
        System.out.println(keysSet);

        Map<Integer,String> mapLh = new LinkedHashMap<Integer, String>();

        for (int ind : keysSet) {
            mapLh.put(ind,map.get(ind));
            System.out.println("Adding "
            + ind
            + ", ");
        }
        System.out.println(mapLh);
    }
}
/* Output:
{33=three, 2=another two, 3=three}
[2, 3, 33]
Adding 2,
Adding 3,
Adding 33,
{2=another two, 3=three, 33=three}
 */

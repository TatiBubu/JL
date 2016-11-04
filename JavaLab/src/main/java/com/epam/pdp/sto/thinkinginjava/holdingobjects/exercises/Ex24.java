package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * Exercise 24: (2) Fill a LinkedHashMap with String keys and objects of your choice.
 * Now extract the pairs, sort them based on the keys, and reinsert them into the Map.
 */
public class Ex24 {
    public static void main(String[] args) {
        LinkedHashMap<String,Gerbil> mapLh = new LinkedHashMap<String,Gerbil>();
        mapLh.put("one",new Gerbil(1));
        mapLh.put("three",new Gerbil(3));
        mapLh.put("two",new Gerbil(2));
        System.out.println(mapLh);

        Set<String> keysSorted = new TreeSet<String>(mapLh.keySet());

        LinkedHashMap<String,Gerbil> mapLH1 = new LinkedHashMap<String,Gerbil>();

        for (String str : keysSorted) {
           mapLH1.put(str,mapLh.get(str));
        }

        mapLh = mapLH1;

        System.out.println(mapLh);
    }
}
/* Output:
{one=exercises.Gerbil@1540e19d, three=exercises.Gerbil@677327b6, two=exercises.Gerbil@14ae5a5}
{one=exercises.Gerbil@1540e19d, three=exercises.Gerbil@677327b6, two=exercises.Gerbil@14ae5a5}
 */


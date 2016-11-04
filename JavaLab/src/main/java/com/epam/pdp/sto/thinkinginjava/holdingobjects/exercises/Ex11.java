package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;


/**
 * Exercise 11: (2) Write a method that uses an Iterator
 * to step through a Collection and print the toString( )
 * of each object in the container. Fill all the different
 * types of Collections with objects and apply your method
 * to each container.
 */
public class Ex11 {
    public static void display(Collection coll) {
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()
                    + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4,7,8,2,0));
        display(list);
        LinkedList<Integer> listL = new LinkedList<Integer>(list);
        display(listL);
        HashSet<Integer> set = new HashSet<Integer>(list);
        display(set);
        TreeSet<Integer> setT = new TreeSet<Integer>(list);
        display(setT);
    }
}
/*Output:
1
4
7
8
2
0

1
4
7
8
2
0

0
1
2
4
7
8

0
1
2
4
7
8
 */



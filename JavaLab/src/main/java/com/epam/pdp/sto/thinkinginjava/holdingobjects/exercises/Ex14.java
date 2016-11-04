package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Exercise 14: (3) Create an empty LinkedList of Integer.
 * Using a Listlterator, add Integers to the List by always inserting them in the middle of the List.
 */
public class Ex14 {
    static void setList(LinkedList<Integer> ll, Integer[] ar) {
        for (int ind : ar) {
            ListIterator it = ll.listIterator(ll.size() / 2);
            it.add(ind);
            System.out.println(ll);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Integer[] arr = {21,31,27,14,29,35};
        Ex14.setList(list,arr);
    }
}
/* Output:
[21]
[31, 21]
[31, 27, 21]
[31, 14, 27, 21]
[31, 14, 29, 27, 21]
[31, 14, 35, 29, 27, 21]
 */



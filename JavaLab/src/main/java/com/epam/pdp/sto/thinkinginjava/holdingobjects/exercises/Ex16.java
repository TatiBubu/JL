package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.*;
/**
 * Exercise 16: (5) Create a Set of the vowels.
 */
public class Ex16 {
    public static void main(String[] args) {
        Set<String> setv = new HashSet<String>();
        Collections.addAll(setv, "A E O U Y I".split(" "));
        System.out.println(setv);
    }
}

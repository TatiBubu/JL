package com.epam.pdp.sto.thinkinginjava.arrays.exercises;

import com.epam.pdp.sto.thinkinginjava.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an argument.
 * Call the method, creating the argument dynamically.
 * Demonstrate that ordinary aggregate array initialization doesn’t work in this case.
 * Discover the only situations where ordinary aggregate array initialization works,
 * and where dynamic aggregate initialization is redundant.
 */
public class Ex1 {
    public static void printBerylliumSphereArr(BerylliumSphere[] berylliumSphereArr) {
        System.out.println(Arrays.toString(berylliumSphereArr));
    }

    public static void main(String[] args) {
       //Dynamic aggregate initialization:
        printBerylliumSphereArr(new BerylliumSphere[] {new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere()});
        //Ordinary aggregate initialization:
        BerylliumSphere[] bsArr = {new BerylliumSphere(),new BerylliumSphere()};
        printBerylliumSphereArr(bsArr);
      //  printBerylliumSphereArr((BerylliumSphere[] arr = new BerylliumSphere[2]));

    }
}


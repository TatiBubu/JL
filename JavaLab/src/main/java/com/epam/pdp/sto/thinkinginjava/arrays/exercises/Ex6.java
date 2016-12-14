package com.epam.pdp.sto.thinkinginjava.arrays.exercises;

import com.epam.pdp.sto.thinkinginjava.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Exercise 6: (1) Write a method that takes two int arguments, indicating the two sizes of a 2-D array.
 * The method should create and fill a 2-D array of BerylliumSphere according to the size arguments.
 */
public class Ex6 {
    public static BerylliumSphere[][] createFill2Darr(int size1, int size2) {
        BerylliumSphere[][] arr = new BerylliumSphere[size1][size2];
        for (int ind = 0; ind < size1; ind++) {
            for (int ind1 = 0; ind1 < size2; ind1++) {
                arr[ind][ind1] = new BerylliumSphere();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createFill2Darr(2,3)));
    }
}
/**Output:
 *[[Sphere 0, Sphere 1, Sphere 2], [Sphere 3, Sphere 4, Sphere 5]]
 */

package com.epam.pdp.sto.thinkinginjava.arrays.exercises;

import com.epam.pdp.sto.thinkinginjava.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Exercise 7: (1) Repeat the previous exercise for a 3-D array.
 */
public class Ex7 {
    public static BerylliumSphere[][][] createFill2Darr(int size1, int size2, int size3) {
        BerylliumSphere[][][] arr = new BerylliumSphere[size1][size2][size3];
        for (int ind = 0; ind < size1; ind++) {
            for (int ind1 = 0; ind1 < size2; ind1++) {
                for (int ind2 = 0; ind2 < size3; ind2++) {
                    arr[ind][ind1][ind2] = new BerylliumSphere();
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createFill2Darr(2,3,1)));
    }
}
/**Output:
 *[[[Sphere 0], [Sphere 1], [Sphere 2]], [[Sphere 3], [Sphere 4], [Sphere 5]]]
 */

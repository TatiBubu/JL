package com.epam.pdp.sto.thinkinginjava.arrays.exercises;

import com.epam.pdp.sto.thinkinginjava.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Exercise 2: (1) Write a method that takes an int argument and returns an array of that size,
 * filled with BerylliumSphere objects.
 */
public class Ex2 {
    public static BerylliumSphere[] fillArrWithBerryliumSphere(int leng) {
        BerylliumSphere[] berSpherArr = new BerylliumSphere[leng];

        for (int index = 0; index < leng; index++) {
            berSpherArr[index] = new BerylliumSphere();
        }
        return berSpherArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArrWithBerryliumSphere(4)));
    }
}
/**Output:
 * [Sphere 0, Sphere 1, Sphere 2, Sphere 3]
*/


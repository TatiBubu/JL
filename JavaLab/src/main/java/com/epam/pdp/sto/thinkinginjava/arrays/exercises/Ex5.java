package com.epam.pdp.sto.thinkinginjava.arrays.exercises;

import com.epam.pdp.sto.thinkinginjava.arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * Exercise 5: (1) Demonstrate that multidimensional arrays of nonprimitive types are automatically initialized to null.
 */
public class Ex5 {
    public static void main(String[] args) {
        BerylliumSphere[][] noPrimArr = new BerylliumSphere[2][3];
        System.out.println(Arrays.deepToString(noPrimArr));
    }
}
/**Output:
 * [[null, null, null], [null, null, null]]
 */

package com.epam.pdp.sto.thinkinginjava.arrays.exercises;

import java.util.Arrays;
import java.util.Random;

/**
 * Exercise 3: (4) Write a method that creates and initializes a twodimensional array of double.
 * The size of the array is determined by the arguments of the method, and the initialization values
 * are a range determined by beginning and ending values that are also arguments of the method.
 * Create a second method that will print the array generated by the first method.
 * In main( ) test the methods by creating and printing several different sizes of arrays.
 */
public class Ex3 {
    //a method that creates and initializes a twodimensional array of double:
    public static double[][] creatInitial2Darr(int arrSize1, double start1, double end1,
                                               int arrSize2) {
        Random rand = new Random();
        double [][] arrD = new double[arrSize1][arrSize2];
        for (int ind = 0; ind < arrSize2; ind++) {
            for (int ind1 = 0; ind1 < arrSize1; ind1++) {
                arrD[ind1][ind] = start1 + (end1 - start1) * rand.nextDouble();
            }
        }
        return arrD;
    }
    //method that will print the array generated by the first method:
    public static void printArr(double[][] arr2D) {
        System.out.println("double[][] = " + Arrays.deepToString(arr2D));
    }

    public static void main(String[] args) {
        double[][] arr1 = creatInitial2Darr(2,3.1,8.7,3);
        double[][] arr2 = creatInitial2Darr(3,0.1,0.3,2);
        double[][] arr3 = creatInitial2Darr(5,100.021,108.7,2);
        printArr(arr1);
        printArr(arr2);
        printArr(arr3);
    }
}
/**Output:
 * double[][] = [[4.353697626331235, 4.177403402496015, 5.550600062893272],
 * [4.014429567300171, 6.576673100715801, 8.413170000512537]]
 double[][] = [[0.10632701042003989, 0.29968649139194015],
 [0.20809996316299914, 0.14749734726446417], [0.13409488130696073, 0.22977379760039598]]
 double[][] = [[105.58083550525436, 107.45358979860137], [106.68859230478893, 103.59686205674784],
 [103.23090572575951, 104.33386024393614], [105.69457138341518, 108.1809325395914],
 [108.2591848481125, 101.46362295583495]]
 */


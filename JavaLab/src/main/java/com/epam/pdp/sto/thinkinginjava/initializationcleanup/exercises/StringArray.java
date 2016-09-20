package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Best on 14.08.2016.
 * Exercise 16: (1) Create an array of String objects and assign a String to each element.
 * Print the array by using a for loop.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] arr = {"one", "two","three"};
        for (int index = 0; index < arr.length; index++) {
            System.out.println("arr[" + index + "]=" + arr[index]);
        }
    }
}
/*Output:
arr[0]=one
arr[1]=two
arr[2]=three
 */


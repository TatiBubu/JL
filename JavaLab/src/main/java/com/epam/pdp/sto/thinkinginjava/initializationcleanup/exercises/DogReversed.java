package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/9/2016.
 * Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have two arguments
 * (of two different types),
 * but in reversed order relative to each other. Verify that this works.
 */
public class DogReversed {
    void bark(char var1, byte var2) {
        System.out.println("bark of char, byte: " + var1 + ", " + var2);
    }

    void bark(byte var1, char var2) {
        System.out.println("bark of byte, char: " + var1 + " " + var2);
    }

    public static void main(String[] args) {
        DogReversed puppy = new DogReversed();
        puppy.bark((char) '1', (byte) 0);
        puppy.bark((byte) 0, (char) '0');
    }
}
/**
 * Output:
 * bark of char, byte: 1, 0
 * bark of byte, char: 0 0
 */

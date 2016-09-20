package com.epam.pdp.sto.thinkinginjava.controllingexecution.exercises;

/**
 * Created by Tetyana_Stolyarova on 6/21/2016.
 * Exercise 4: (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and
 * print prime numbers (integral numbers that are not evenly
 * divisible by any other numbers except for themselves and 1).
 */
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int indicator = 0;
            for (int j = 1; j < (i + 2) / 2; j++) {
                if (i % j == 0) {
                    indicator++;
                }
            }
            if (indicator < 2) {
                System.out.println("prime: " + i);
            }
        }
    }
}

package com.epam.pdp.sto.thinkinginjava.operators.exercises;

/**
 * Exercise 4: (2) Write a program that calculates velocity using a constant distance and a constant time.
 */
public class Ex4 {
    static int distance = 100;
    static int time = 5;

    public static void main(String[] args) {
              int velocity = distance / time;
        System.out.println("velocity = "
        + velocity);
    }
}
/**Output:
 * velocity = 20
*/

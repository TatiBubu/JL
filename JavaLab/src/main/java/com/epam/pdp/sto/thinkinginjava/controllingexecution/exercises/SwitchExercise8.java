package com.epam.pdp.sto.thinkinginjava.controllingexecution.exercises;

/**
 * Created by Tetyana_Stolyarova on 7/28/2016.
 * Exercise 8: (2) Create a switch statement that prints a message for each case,
 * and put the switch inside a for loop that tries each case.
 * Put a break after each case and test it, then remove the breaks and see what happens.
 */
public class SwitchExercise8 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
                case 4:
                    System.out.println("case 4");
                    break;
                default:
                    System.out.println("default");
            }
        }
    }
}
/**
 * Output for "case with break":
 * case 1
 * case 2
 * case 3
 * case 4
 * Output for "case without break":
 * case 1
 * case 2
 * case 3
 * case 4
 * case 2
 * case 3
 * case 4
 * case 3
 * case 4
 * case 4
 */

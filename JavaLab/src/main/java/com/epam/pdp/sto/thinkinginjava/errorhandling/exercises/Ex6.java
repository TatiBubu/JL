package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 6: (1) Create two exception classes,
 * each of which performs its own logging automatically.
 * (Classes LoggingException1 and LoggingException2 сreated)
 * Demonstrate that these work.
 */
public class Ex6 {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (LoggingException1 excep) {
            System.err.println("Caught "
            + excep);
        }
        try {
            throw new LoggingException2();
        } catch (LoggingException2 excep) {
            System.err.println("Caught "
                    + excep);
        }
    }
}
/*Output:
Nov 11, 2016 9:24:53 PM com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1 <init>
SEVERE: com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1
Caught com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1
Nov 11, 2016 9:24:53 PM com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException2 <init>
SEVERE: com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException2
Caught com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException2
 */


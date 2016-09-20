package com.epam.pdp.sto.thinkinginjava.everythingisanobject.exercises;

/**
 * Exercise 7: (1) Turn the Incrementable code fragments into a working program.
 */
public class Ex7 {
    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(StaticTest.i);
    }
}
/**Output:
 * 48
 */

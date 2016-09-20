package com.epam.pdp.sto.thinkinginjava.operators.exercises;

/**
 * Exercise 3: (1) Create a class containing a float and use it to demonstrate aliasing during method calls.
 */
public class Ex3 {
    static void  aliasMethod(Alias ali) {
        ali.af = 4.4f;
    }

    public static void main(String[] args) {
        Alias ali = new Alias();
        ali.af = 5.5f;
        System.out.println("ali.af = "
        + ali.af);
        aliasMethod(ali);
        System.out.println("ali.af = "
                + ali.af);
    }
}
/** Output:
 * ali.af = 5.5
 ali.af = 4.4
 */


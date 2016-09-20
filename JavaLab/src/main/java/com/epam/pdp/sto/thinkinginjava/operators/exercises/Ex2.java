package com.epam.pdp.sto.thinkinginjava.operators.exercises;

/**
 * Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.
 */
public class Ex2 {
    public static void main(String[] args) {
        Alias ali1 = new Alias();
        Alias ali2 = new Alias();
        ali1.af = 1.1f;
        ali2.af = 2.2f;
        System.out.println("1: ali1.af = "
        + ali1.af
        + "; ali2.af = "
        + ali2.af );
        ali1 = ali2;
        System.out.println("2: ali1.af = "
                        + ali1.af
               + "; ali2.af = "
                        + ali2.af);
        ali1.af = 3.3f;
        System.out.println("3: ali1.af = "
                        + ali1.af
               + "; ali2.af = "
                        + ali2.af);
    }
  }
/**Output:
 * 1: ali1.af = 1.1; ali2.af = 2.2
 2: ali1.af = 2.2; ali2.af = 2.2
 3: ali1.af = 3.3; ali2.af = 3.3
 */

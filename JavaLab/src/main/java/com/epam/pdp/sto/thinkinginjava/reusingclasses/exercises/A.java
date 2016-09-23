package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Additional to solve Exercise 5: (1) Create two classes, A and B, with default constructors
 *Additional to Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments
 * instead of default constructors.
 */
public class A {
    int val;

    A() {
        System.out.println("A()");
            }

    A(int val) {
        System.out.println("A(int val); val =  "
        + val);
    }
  }



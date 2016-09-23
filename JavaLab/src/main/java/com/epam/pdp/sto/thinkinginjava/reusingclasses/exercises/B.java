package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Additional to resolve Exercise 5: (1) Create two classes, A and B, with default constructors
 * Additional to Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments
 * instead of default constructors.
 */
public class B {
    B() {
        System.out.println("B()");
    }

    B(int val) {
        System.out.println("B(int val); val =  "
        + val);
    }

}
/**Output:
 * A()
 B()
  */


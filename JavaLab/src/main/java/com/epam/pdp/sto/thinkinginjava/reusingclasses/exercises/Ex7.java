package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
 * Write a constructor for C and perform all initialization within C’s constructor.
 */
public class Ex7 {
    public static void main(String[] args) {
        C itc = new C(5);
    }

}
/**Output:
 * A(int val); val =  5
 C(int val)5
 B()
 */

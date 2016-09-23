package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 *Exercise 4: (2) Prove that the base-class constructors are
 * (a) always called and
 * (b) called before derived-class constructors.
 */
public class Ex4 extends Simple {

    Ex4() {
        System.out.println("Ex4()");
    }

    public static void main(String[] args) {
        Ex4 item = new Ex4();
    }

}
/**Output:
 * Simple constructed
 Ex4()
 */

package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 17: (1) Modify Exercise 16 so that Frog17 overrides the method
 * definitions from the base class
 * (provides new definitions using the same method signatures).
 * Note what happens in main( ).
 */
public class Ex17 {
    public static void main(String[] args) {
        Frog17 fr = new Frog17();
        Amphibian.live(fr);
    }

}
/**Output:
 * breate()
 overriden method breath()
 */

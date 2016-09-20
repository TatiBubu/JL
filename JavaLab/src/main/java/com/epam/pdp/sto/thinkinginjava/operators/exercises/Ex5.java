package com.epam.pdp.sto.thinkinginjava.operators.exercises;

/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says.
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
 * Then display their names and what they say.
 */
public class Ex5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
    }
}
/**Output:
 * Dog spot says Ruff!;
 Dog scruffy says Wurf!;
 */


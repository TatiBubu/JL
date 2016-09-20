package com.epam.pdp.sto.thinkinginjava.operators.exercises;

/**
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
 * Test for comparison using == and equals( ) for all references.
 */
public class Ex6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog = new Dog("brov", "Gav!");
        dog = dog1;
        System.out.println("dog == dog1 is "
                + (dog == dog1));
        System.out.println("dog.equals(dog1) is "
               + dog.equals(dog1));
    }
}
/**Output:
 * Dog spot says Ruff!;
 Dog brov says Gav!;
 dog==dog1 is true
 dog.equals(dog1) is true
 */


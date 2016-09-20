package com.epam.pdp.sto.thinkinginjava.everythingisanobject.exercises;

/**
 * Exercise 6: (2) Write a program that includes
 * and calls the storage( ) method defined as a code fragment in this chapter.
 */
public class Ex6 {
    int storage(String astring) {
        return astring.length() * 2;
    }

    public static void main(String[] args) {
        Ex6 inst = new Ex6();
        System.out.println(inst.storage("Exercise 6"));
    }
}
/**Output:
 *20
 */



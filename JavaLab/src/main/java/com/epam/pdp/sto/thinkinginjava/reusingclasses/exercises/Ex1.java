package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 1: (2) Create a simple class (). Inside a second class,
 * define a reference to an object of the first class.
 * Use lazy initialization to instantiate this object.
 */
public class Ex1 {
    public void lazyInit(int val) {
        if (val > 5) {
            Simple element = new Simple();
        }        else {
            System.out.println("val <= 5");
        }
    }

    public static void main(String[] args) {
        Ex1 testel = new Ex1();
        testel.lazyInit(6);
        testel.lazyInit(5);
    }
}
/**Output:
 * Simple constructed
 val <= 5
 */

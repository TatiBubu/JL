package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 8: (1) Create a base class with only a non-default constructor, and a derived class
 * with both a default and non-default constructor.
 * In the derived-class constructors, call the base-class constructor.
 */
public class Ex8 extends Simple{
    Ex8() {
        super();
        System.out.println("Ex8()");
    }

    Ex8(String str) {
        super();
        System.out.println("Ex8(String str)");
    }

    public static void main(String[] args) {
        Ex8 it = new Ex8();

        Ex8 itarg = new Ex8("arg constr");
    }
}
/**Output:
 * Simple constructed
 Ex8()
 Simple constructed
 Ex8(String str)
 */

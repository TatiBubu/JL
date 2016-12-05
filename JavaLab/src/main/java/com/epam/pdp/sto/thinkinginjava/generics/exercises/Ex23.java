package com.epam.pdp.sto.thinkinginjava.generics.exercises;

/**
// * Exercise 23: (1) Modify FactoryConstraint.java so that create( ) takes an argument.
// * Following classes, interfaces have been rewritten:
 */
//  FactoryI<T>, Foo2<T>, Widget

public class Ex23 {
    public static void main(String[] args) {
        new Foo2<Widget>(new Widget.Factory(),15);
    }
}

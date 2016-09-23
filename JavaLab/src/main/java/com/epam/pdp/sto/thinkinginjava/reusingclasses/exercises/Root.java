package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Add to Exercise 9: (2) Create a class called Root
 * that contains an instance of each of the classes (that you also create) named Component1, Component2, and Component3
 */
public class Root {
    Root() {
        System.out.println("Root()");
    }

        Component1 c1 = new Component1();

        Component2 c2 = new Component2();

        Component3 c3 = new Component3();

   void dispose() {
       c1.dispose();
       c2.dispose();
       c3.dispose();
       System.out.println("Root.dispose()");
    }
    }




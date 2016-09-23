package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 13: (2) Create a class with a method that is overloaded three times.
 * Inherit a new class, add a new overloading of the method, and
 * show that all four methods are available in the derived class.
 */
public class Ex13 {
    public static void main(String[] args) {
Ex13AddDerivedOverloadMethod it = new Ex13AddDerivedOverloadMethod();
        it.methodOv('x');
        it.methodOv(1.0F);
        it.methodOv("some");
        it.methodOv(new Simple());
    }
}
/**Output:
 * methodOv(char ch)
 methodOv(float fl)
 methodOv(String str)
 Simple constructed
 methodOv(Simple si)
 */

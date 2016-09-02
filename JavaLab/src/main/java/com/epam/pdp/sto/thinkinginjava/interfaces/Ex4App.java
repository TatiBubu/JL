package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/2/2016.
 * Exercise 4: (3) Create an abstract class with no methods.
 * Derive a class and add a method.
 * Create a static method that takes a reference to the base class,
 * downcasts it to the derived class, and calls the method.
 * In main( ), demonstrate that it works.
 * Now put the abstract declaration for the method in the base class, thus eliminating the need for the downcast.
 */
public class Ex4App {

    public static void firstMethod(NoMethods elem1) {
        ((NoMethodsChild)elem1).doSome();
    }

    public static void secondMethod(AbstractMethod elem2) {
        elem2.doSome1();
    }

    public static void main(String[] args) {
        NoMethodsChild elem = new NoMethodsChild();
        firstMethod(elem);
        AbstractMethodChild newElem = new AbstractMethodChild();
        Ex4App.secondMethod(newElem);
    }
}
/**Output:
 * doSome
 doSome1()

 * */


package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception inside a try block.
 * Give the constructor for Exception a String argument.
 * Catch the exception inside a catch clause and print the String argument.
 * Add a finally clause and print a message to prove you were there.
 */
public class Ex1 {
    public void throwingExceptionMathod() throws Exception {
        System.out.println("Throw Exception from meth()");
        throw new Exception("Ex1 Exception");
    }

    public static void main(String[] args) {
        Ex1 ex1Obj = new Ex1();
        try {
            ex1Obj.throwingExceptionMathod();
        } catch (Exception except) {
            System.out.println("Exception thrown by throwingExceptionMathod() is cought!");
        }
    }
}
/*Output:
Throw Exception from meth()
Exception thrown by throwingExceptionMathod() is cought!
 */

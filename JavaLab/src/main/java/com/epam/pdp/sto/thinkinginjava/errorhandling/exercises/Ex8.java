package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 8: (1) Write a class with a method that throws an exception of the type created in
 * Exercise 4. Try compiling it without an exception specification to see what the compiler says.
 * UNHANDLED EXCEPTION: exceptions.MyException
 * Add the appropriate exception specification.
 * Try out your class and its exception inside a try-catch clause.
 */
public class Ex8 {
    public void throwException() throws MyException {
        throw new MyException("Exception String value");
    }

    public static void main(String[] args) {
        Ex8 objEx8 = new Ex8();
        try {
            objEx8.throwException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
/*Output:
MyException(String exceptionStringVal)
exceptions.MyException: Exception String value
 */

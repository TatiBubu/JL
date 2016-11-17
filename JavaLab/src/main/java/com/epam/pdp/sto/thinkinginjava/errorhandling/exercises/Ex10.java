package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 10: (2) Create a class with two methods, callThrowLoggingExcep( ) and throwLoggingExcep( ).
 * In throwLoggingExcep( ), throw an exception of a new type that you define.
 * In callThrowLoggingExcep( ), call throwLoggingExcep( ),
 * catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
 * Test your code in main( ).
 */
public class Ex10 {
    public static void throwLoggingExcep() throws LoggingException1 {
        System.out.println("LoggingException1 thrown from throwLoggingExcep()");
        throw new LoggingException1();
    }

    public static void callThrowLoggingExcep() throws Exception {
        try {
            throwLoggingExcep();
        } catch (Exception excep) {
            System.out.println("Inside callThrowLoggingExcep(); excep.printStackTrace()");
            excep.printStackTrace(System.out);
            throw new LoggingException2();
        }
    }

    public static void main(String[] args) {
        try {
            callThrowLoggingExcep();
        } catch (Exception excep) {
            System.out.println("main(): printStackTrace() ");
            excep.printStackTrace(System.out);
        }
    }
}

package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Additional for Exercise 4: (2) Create your own exception class using the extends keyword.
 * Write a constructor for this class that takes a String argument
 * and stores it inside the object with a String reference.
 */
public class MyException extends Exception {
    private String exceptionStringVal;

    MyException(String exceptionStringVal) {
        super(exceptionStringVal);
        System.out.println("MyException(String exceptionStringVal)");
        this.exceptionStringVal = exceptionStringVal;
    }

    public String displayMyExceptionStoredStringVal() {
        return "MyException stored String exceptionStringVal = "
                + this.exceptionStringVal;
    }
}

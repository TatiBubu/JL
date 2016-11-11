package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 4: (2) Create your own exception class using the extends keyword.
 * Write a constructor for this class that takes a String argument
 * and stores it inside the object with a String reference.
 * (MyException class created)
 * Write a method that displays the stored String. Create a try-catch clause to exercise your new exception.
 */
public class Ex4 {
   public static void throwMyException() throws MyException {
        System.out.println("Throwing MyException from throwMyException()");
        throw new MyException("IT HAPPEND AGAIN!");
    }

    public static void main(String[] args) {
        try {
            throwMyException();
        } catch (MyException excep) {
            System.out.println("Cought MyException");
            System.out.println(excep.displayMyExceptionStoredStringVal());
            excep.printStackTrace();

        }
    }
}
/*Output:
Throwing MyException from throwMyException()
com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.MyException: IT HAPPEND AGAIN!
MyException(String exceptionStringVal)
at com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex4.throwMyException(Ex4.java:13)
Cought MyException
at com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex4.main(Ex4.java:18)
MyException stored String exceptionStringVal = IT HAPPEND AGAIN!
 */


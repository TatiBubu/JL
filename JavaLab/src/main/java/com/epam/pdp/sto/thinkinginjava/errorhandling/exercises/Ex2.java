package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 2: (1) Define an object reference and initialize it to null.
 * Try to call a method through this reference.
 * Now wrap the code in a try-catch clause to catch the exception.
 */
public class Ex2 {
    int intVal;

    public void methodEx2() {
        System.out.println("Ex2.methodEx2();");
    }

    public static void main(String[] args) {
       try {
           Ex2 objEx2 = null;
           objEx2.methodEx2();
    } catch (Exception excep) {
           excep.printStackTrace(System.out);
       }
    }
}
/*Output:
java.lang.NullPointerException
 */



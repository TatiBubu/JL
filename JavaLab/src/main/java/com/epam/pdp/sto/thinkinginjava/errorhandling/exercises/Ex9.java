package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three.
 * FOLLOWING EXCEPTION CLASSES USED AS ADDITIONAL FOR THIS EXCERCISE:
 * LoggingException1.java, LoggingException2.java, MyException.java.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Ex9 {
    public static void throw3Exceptions(String excepType) throws Exception {
        switch (excepType) {
            case "L1" : throw new LoggingException1();
            case "L2" : throw new LoggingException2();
            case "M" : throw new MyException("some string val");
            default :
                System.out.println("default switch value");
                break;
        }
    }

    public static void main(String[] args) {
        try {
            throw3Exceptions("L1");
            throw3Exceptions("L2");
            throw3Exceptions("M");
        } catch (Exception excep) {
            System.out.println("Caught Exception");
            System.out.println("getMessage(): "
            + excep.getMessage());
            System.out.println("getLocalizedMessage(): "
            + excep.getLocalizedMessage());
            System.out.println("toString: "
            + excep);
            excep.printStackTrace(System.out);
        }
    }
}
/*Output:
Caught Exception
Nov 15, 2016 7:33:46 PM com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1 <init>
getMessage(): null
SEVERE: com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1
getLocalizedMessage(): null
toString: com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1
com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.LoggingException1
 */

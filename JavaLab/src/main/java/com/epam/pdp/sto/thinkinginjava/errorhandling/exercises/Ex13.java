package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex9.EXCEP_TYPE_1;
import static com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex9.EXCEP_TYPE_2;
import static com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex9.EXCEP_TYPE_3;

/**
 * Exercise 13: (2) Modify Exercise 9 by adding a finally clause.
 * Verify that your finally clause is executed, even if a NullPointerException is thrown.
 * SWITCH has been updaetd to contain NullPointerException;
 */
public class Ex13 {
    public static void throw3Exceptions(String excepType) throws Exception {
        switch (excepType) {
            case EXCEP_TYPE_1:
                throw new LoggingException1();
            case EXCEP_TYPE_2:
                throw new LoggingException2();
            case EXCEP_TYPE_3:
                throw new MyException("some string val");
            default:
                throw new NullPointerException();
        }
    }

    public static void throwExceptionByTypeAndHandleIt(String excepType) {
        try {
            throw3Exceptions(excepType);
        } catch (Exception excep) {
            excep.printStackTrace(System.out);
        } finally {
            System.out.println("finally in try block");
        }
    }

    public static void main(String[] args) {
        String[] excepArr = {EXCEP_TYPE_1, EXCEP_TYPE_2, EXCEP_TYPE_3, "def"};

        List<String> excepListLn = Arrays.asList(excepArr);
        Iterator<String> iter = excepListLn.iterator();
        while (iter.hasNext()) {
            throwExceptionByTypeAndHandleIt(iter.next());
        }

    }
}


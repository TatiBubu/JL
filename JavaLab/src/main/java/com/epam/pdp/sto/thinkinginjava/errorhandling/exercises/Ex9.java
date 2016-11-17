package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three.
 * FOLLOWING EXCEPTION CLASSES USED AS ADDITIONAL FOR THIS EXCERCISE:
 * LoggingException1.java, LoggingException2.java, MyException.java.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Ex9 {
    private static final String EXCEP_TYPE_1 = "L1";
    private static final String EXCEP_TYPE_2 = "L2";
    private static final String EXCEP_TYPE_3 = "M";


    public static void throw3Exceptions(String excepType) throws Exception {
        switch (excepType) {
            case EXCEP_TYPE_1:
                throw new LoggingException1();
            case EXCEP_TYPE_2:
                throw new LoggingException2();
            case EXCEP_TYPE_3:
                throw new MyException("some string val");
            default:
                System.out.println("default switch value");
                break;
        }
    }

    public static void throwExceptionByTypeAndHandleIt(String excepType) {
        try {
            throw3Exceptions(excepType);
        } catch (Exception excep) {
            excep.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        String[] excepTypes = {EXCEP_TYPE_1, EXCEP_TYPE_2, EXCEP_TYPE_3};
//        for (int index = 0; index < excepTypes.length; index++) {
//            System.out.println("Index = " + index );
//           throwExceptionByTypeAndHandleIt(excepTypes[index]);
//        }
//        int index = 0;
//
//        while (index < excepTypes.length) {
//            System.out.println("Index = " + index );
//            throwExceptionByTypeAndHandleIt(excepTypes[index]);
//            index++;
//        }
//
//        for (String excepType : excepTypes) {
//            throwExceptionByTypeAndHandleIt(excepType);
//        }

//        index = 0;
//        do {
//            throwExceptionByTypeAndHandleIt(excepTypes[index]);
//            index++;
//        }
//        while (index < excepTypes.length);
//
//        do {
//            index--;
//            throwExceptionByTypeAndHandleIt(excepTypes[index]);
//
//        }
//        while (index > 0);

        List<String> excepTypesList = Arrays.asList(excepTypes);

        for (Iterator<String> it = excepTypesList.iterator(); it.hasNext();) {
            throwExceptionByTypeAndHandleIt(it.next());
        }
    }
}

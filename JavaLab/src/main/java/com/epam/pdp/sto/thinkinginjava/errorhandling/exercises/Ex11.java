package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import static com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex10.throwLoggingExcep;

/**
 * Exercise 11: (1) Repeat the previous exercise,
 * but inside the catch clause, wrap throwLoggingExcep’s exception in a RuntimeException.
 * [callThrowLoggingExcepWrapRuntimeExcep method create dto call throwLoggingExcep and wrap it in Runtime exception]
 */
public class Ex11 {
    public static void callThrowLoggingExcepWrapRuntimeExcep() throws Exception {
        try {
            throwLoggingExcep();
        } catch (Exception excep) {
            System.out.println("Inside callThrowLoggingExcepWrapRuntimeExcep(); excep.printStackTrace()");
            excep.printStackTrace(System.out);
            throw new RuntimeException(excep);
        }
    }

    public static void main(String[] args) {
        try {
            callThrowLoggingExcepWrapRuntimeExcep();
        } catch (Exception excep) {
            System.out.println("main(): printStackTrace() ");
            excep.printStackTrace(System.out);
        }
    }
}

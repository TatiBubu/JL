package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Exercise 7: (1) Modify Exercise 3 so that the catch clause logs the results.
 */
public class Ex7 {
    private static Logger logger = Logger.getLogger("Logging Exception from Ex7");

    static void logException(Exception excep) {
        StringWriter trace = new StringWriter();
        excep.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        int[] stringArr = new int[3];
        try {
            for (int index = 0; index < 4; index++) {
                stringArr[index] = index;
                System.out.println("stringArr["
                        + index
                        + "] = "
                        + stringArr[index]);
            }
        } catch (ArrayIndexOutOfBoundsException excep) {
            logException(excep);
            excep.printStackTrace(System.out);
        }
    }
}
/*Output:
stringArr[0] = 0
stringArr[1] = 1
stringArr[2] = 2
Nov 11, 2016 9:54:30 PM com.epam.pdp.sto.thinkinginjava.errorhandling.exercises.Ex7 logException
SEVERE: java.lang.ArrayIndexOutOfBoundsException: 3
 */



package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Additional for Ex6 class: Exercise 6: (1) Create two exception classes,
 * each of which performs its own logging automatically.
 */
public class LoggingException1 extends Exception {
    private Logger logger = Logger.getLogger("LoggingException1");

    public LoggingException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}


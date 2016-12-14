package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Additional for Ex6 class: Exercise 6: (1) Create two exception classes,
 * each of which performs its own logging automatically.
 */
public class LoggingException2 extends Exception {
        private Logger logger = Logger.getLogger("LoggingException2");

    public LoggingException2() {
            StringWriter trace = new StringWriter();
            printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
}

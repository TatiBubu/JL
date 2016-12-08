package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

import com.epam.pdp.sto.thinkinginjava.errorhandling.OnOffException1;
import com.epam.pdp.sto.thinkinginjava.errorhandling.OnOffException2;
import com.epam.pdp.sto.thinkinginjava.errorhandling.Switch;

/**
 * Exercise 14: (2) Show that OnOffSwitch.java can fail
 * by throwing a RuntimeException inside the try block.
 */
public class Ex14 {
        private static Switch sw = new Switch();

        public static void throwOnOffExcep()
                throws OnOffException1, OnOffException2 {
        }

        public static void main(String[] args) {
            RuntimeException excepRunT = new RuntimeException();
            try {
                sw.on();
// Code that can throw exceptions...
                throwOnOffExcep();
                sw.off();

                throw excepRunT;
            } catch (OnOffException1 excep) {
                System.out.println("OnOffException1");
                sw.off();
            } catch (OnOffException2 excep) {
                System.out.println("OnOffException2");
                sw.off();
            }
        }
    }
/* Output:
Exception in thread "main" on
off
java.lang.RuntimeException
 */



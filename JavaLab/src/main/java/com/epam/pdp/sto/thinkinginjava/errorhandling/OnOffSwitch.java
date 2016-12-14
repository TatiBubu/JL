package com.epam.pdp.sto.thinkinginjava.errorhandling;

/**
 * Created by Tetyana_Stolyarova on 11/22/2016.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void testMeth()
            throws OnOffException1,OnOffException2 {}

    public static void main(String[] args) {
            try {
            sw.on();
// Code that can throw exceptions...
                testMeth();
          sw.off();
        } catch (OnOffException1 excep) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 excep) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}


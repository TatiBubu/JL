package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

import com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises.Currency;

/**
 * Created by Best on 14.08.2016.
 * Exercise 21: (1) Create an enum of the least-valuable six types of paper currency.
 * Loop through the values( ) and print each value and its ordinal( ).
 */
public class Ex21 {
    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.println(c + ", ordinal " + c.ordinal());
        }
    }
}
/**Output:
 * ONE, ordinal0
 * TWO, ordinal1
 * FIVE, ordinal2
 * TEN, ordinal3
 * TWENTY, ordinal4
 * FIFTY, ordinal5
 */

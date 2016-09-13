package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/13/2016.
 * Exercise 11: (4) Create a class with a method that takes
 * a String argument and produces a result that swaps each pair
 * of characters in that argument. Adapt
 * the class so that it works with interfaceprocessor.Apply.process( ).
 */
public class Swapper {
    static String process(String input) {
    char[] cha = new char[input.length()];
        if ((input.length()) % 2 == 0) {
            for (int index = 0; index < input.length(); index += 2 ) {
                cha[index] = input.charAt(index + 1);
                cha[index + 1] = input.charAt(index);
            }

        return new String(cha);
        }       else {
                for (int index = 0; index < input.length() - 1; index += 2 ) {
                cha[index] = input.charAt(index + 1);
                    cha[index + 1] = input.charAt(index);
                }
                cha[input.length() - 1] = input.charAt(input.length() - 1);
            return new String(cha);
        }
    }
}

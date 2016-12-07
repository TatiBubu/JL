package com.epam.pdp.sto.thinkinginjava.strings.exercises;

import com.epam.pdp.sto.thinkinginjava.strings.Turtle;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Exercise 3: (1) Modify Turtle.java so that it sends all output to System.err.
 */
public class Ex3 {
    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy",
                new Formatter(System.err));
        Turtle terry = new Turtle("Terry",
                new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}

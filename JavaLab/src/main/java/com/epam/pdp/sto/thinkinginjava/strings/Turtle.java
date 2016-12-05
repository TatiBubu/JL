package com.epam.pdp.sto.thinkinginjava.strings;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter form;

    public Turtle(String name, Formatter form) {
        this.name = name;
        this.form = form;
    }

    public void move(int xint, int yint) {
        form.format("%s The Turtle is at (%d,%d)\n", name, xint, yint);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("Tommy",
                new Formatter(System.out));
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

package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

/**
 * Created by Tetyana_Stolyarova on 11/4/2016.
 */
public class Command {
    private String str;

    Command(String str) {
        this.str = str;
    }

    public void operation() {
        System.out.println(str);
    }
}

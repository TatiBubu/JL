package com.epam.pdp.sto.thinkinginjava.errorhandling;

/**
 * Created by Tetyana_Stolyarova on 11/22/2016.
 */
public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
}

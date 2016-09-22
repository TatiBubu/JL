package com.epam.pdp.sto.thinkinginjava.reusingclasses;


class Cleanser {
    private String s = "Cleanser";

    public void append(String as) {
        s += as;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser ax = new Cleanser();
        ax.dilute();
        ax.apply();
        ax.scrub();
        System.out.println(ax);
    }
}

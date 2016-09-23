package com.epam.pdp.sto.thinkinginjava.polymorph;

public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    public String toString() {
        return "Woodwind";
    }
}

package com.epam.pdp.sto.thinkinginjava.polymorph;

class Woodwind extends Wind {
    void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    public String toString() {
        return "Woodwind";
    }
}


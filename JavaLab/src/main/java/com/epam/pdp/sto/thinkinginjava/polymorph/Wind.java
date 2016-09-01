package com.epam.pdp.sto.thinkinginjava.polymorph;

class Wind extends Instrument {

    void play(Note note) {

        System.out.println("Wind.play() " + note);
    }

    public String toString() {

        return "Percussion";
    }

    void adjust() {

        System.out.println("Adjusting Wind");
    }
}






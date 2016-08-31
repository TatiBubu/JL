package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Best on 30.08.2016.
 * Exercise 7: (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.
 */
public class Drums extends Instrument {
    void play(Note note) {
        System.out.println("Drums.play() " + note);
    }

    public String toString() {
        return "Drums";
    }

    void adjust() {
        System.out.println("Adjusting Drums");
    }
}
//* Output:
//Wind.play() MIDDLE_C
//Percussion.play() MIDDLE_C
//Stringed.play() MIDDLE_C
//Brass.play() MIDDLE_C
//Woodwind.play() MIDDLE_C
//Drums.play() MIDDLE_C
//Percussion
//Percussion
//Stringed
//Percussion
//Woodwind
//Drums

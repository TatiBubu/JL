package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Best on 29.08.2016.
 * Exercise 6: (1) Change Music3.java so that what( )
 * becomes the root Object method toString( ).
 * Try printing the Instrument objects using System.out.println( ) (without any casting).
 */
public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument instrument) {
// ...
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] elem) {
        for (Instrument instrument : elem) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
// Upcasting during addition to the array:

        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Drums()
        };
        tuneAll(orchestra);

        for (Instrument i : orchestra) {
            System.out.println(i);
        }
    }
} /* Output:
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
*///:~


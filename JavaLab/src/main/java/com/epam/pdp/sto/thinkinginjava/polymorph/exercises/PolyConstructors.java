package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;
/*Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and
/demonstrate the problem described in this section. */


public class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph(56,23);
    }
}
/** Output:
// Glyph() before draw()
// RoundGlyph.draw(), radius = 0
// Glyph() after draw()
// RoundGlyph.RoundGlyph(), radius = 5 */

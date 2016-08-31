package com.epam.pdp.sto.thinkinginjava.polymorph;


class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int rad) {
        radius = rad;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}


package com.epam.pdp.sto.thinkinginjava.polymorph;

class RectangularGlyph extends Glyph {
    private int width = 2;

    private int height = 3;

    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("RectangularGlyph.RectangularGlyph(), width = " + width
                + " height = "
                + height) ;
    }

    void draw() {
        System.out.println("RectangularGlyph.draw(), width = "  + width
                + ", height = "
                + height);
    }
}

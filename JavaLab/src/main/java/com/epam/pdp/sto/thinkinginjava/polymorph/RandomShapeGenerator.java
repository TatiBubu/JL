package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
  import com.epam.pdp.sto.thinkinginjava.polymorph.exercises.Fractus;

  import java.util.Random;


// A "factory" that randomly creates shapes.

public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0: return new Fractus();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Circle();
        }
    }
}


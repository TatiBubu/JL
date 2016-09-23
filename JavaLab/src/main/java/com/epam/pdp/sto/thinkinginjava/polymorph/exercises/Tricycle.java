package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

class Tricycle extends Cycle {

    public void ride(int km) {
        System.out.println("Tricycle rides " + km + " km;");
    }

    public void wheels() {
        System.out.println("Tricycle with 3 wheels");
    }
}

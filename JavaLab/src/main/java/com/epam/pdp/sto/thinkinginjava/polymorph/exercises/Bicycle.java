package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

class Bicycle extends Cycle {

    public void ride(int km) {
        System.out.println("Bicycle rides " + km + " km;");
    }

    public void wheels() {
        System.out.println("Bycle with 2 wheels");
    }
}

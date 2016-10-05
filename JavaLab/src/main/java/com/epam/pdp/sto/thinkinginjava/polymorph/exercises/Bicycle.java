package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

class Bicycle extends Cycle {
    Bicycle() {
        super(2);
    }

    public void ride(int km) {
        System.out.println("Bicycle rides " + km + " km;");
    }

    }


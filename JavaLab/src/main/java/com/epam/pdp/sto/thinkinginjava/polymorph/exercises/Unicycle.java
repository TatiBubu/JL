package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

class Unicycle extends Cycle {
Unicycle() {
    super(1);
}

    public void ride(int km) {
        System.out.println("Unicycle rides " + km + " km;");
    }
}

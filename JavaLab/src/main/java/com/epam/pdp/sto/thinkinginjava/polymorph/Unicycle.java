package com.epam.pdp.sto.thinkinginjava.polymorph;

class Unicycle extends Cycle {

    public void ride(int km) {
        System.out.println("Unicycle rides " + km + " km;");
    }

    public void wheels() {
        System.out.println("Unicycle with 1 wheel");
    }
}

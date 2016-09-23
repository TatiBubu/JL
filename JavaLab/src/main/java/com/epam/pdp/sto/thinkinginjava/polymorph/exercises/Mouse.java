package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;


public class Mouse extends Rodent {
@Override public void cave() {
    System.out.println("Mouse id caving");
}

@Override public void jump() {
    System.out.println("Mouse Jump()");
}

@Override public String toString() {
   return "Mouse";
}
}


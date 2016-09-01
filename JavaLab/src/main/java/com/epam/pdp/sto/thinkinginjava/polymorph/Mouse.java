package com.epam.pdp.sto.thinkinginjava.polymorph;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
public class Mouse extends Rodent {
@Override public void cave() {
    System.out.println("Mouse id caving");
}

@Override public String toString() {
   return "Mouse";
}
}

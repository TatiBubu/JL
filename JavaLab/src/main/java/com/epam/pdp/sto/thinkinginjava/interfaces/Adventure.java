package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 * Exercise 12: (2) In Adventure.java, add an interface called CanClimb,
 * following the form of the other interfaces.
 */
public class Adventure {
    public static void toi(CanFight inst) {
        inst.fight();
    }

    public static void uoi(CanSwim inst) {
        inst.swim();
    }

    public static void voi(CanFly inst) {
        inst.fly();
    }

    public static void woi(ActionCharacter inst) {
        inst.fight();
    }

    public static void coi(CanClimb inst) {
        inst.climb();
    }

    public static void main(String[] args) {
        Hero hoi = new Hero();
        toi(hoi); // Treat it as a CanFight
        uoi(hoi); // Treat it as a CanSwim
        voi(hoi); // Treat it as a CanFly
        woi(hoi); // Treat it as an ActionCharacter
        coi(hoi);
    }
}

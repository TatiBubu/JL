package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 * Exercise 14: (2) Create three interfaces, each with two methods.
 * Inherit a new interface that combines the three, adding a new method.
 * Create a class by implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces as an argument.
 * In main( ), create an object of your class and pass it to each of the methods.
 */
public class Djequipment extends MusicEquipment {
    static  void playTurntable(Turntable turn) {
        turn.play();
    }

    static void playCdj(Cdj cdj) {
        cdj.play();
    }

    static void playMixer(Mixer mix) {
        mix.mix();
    }

    static void addVolume(DjHardware hard) {
        hard.addVolume(100500);
    }

    public static void main(String[] args) {
        Djequipment equip = new Djequipment();
        playTurntable(equip);
        playCdj(equip);
        playMixer(equip);
        addVolume(equip);
    }
}

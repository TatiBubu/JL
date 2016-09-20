package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 * Exercise 15: (2) Modify the previous exercise by creating
 * an abstract class and inheriting that into the derived class.
 */
public abstract class MusicEquipmentAbstract implements Turntable, Mixer, Cdj, DjHardware {

    abstract void myMethod();

    public void mix() {
        System.out.println("Mixing from abstract");
    }

    public void play() {
        System.out.println("Started playing from abstract");
    }

    public void stop() {
        System.out.println("Stopped playing from abstract");
    }

    public void addVolume(int vol) {
        System.out.println("Volume is higher for "
                + vol
                + " decibel from abstract");
    }

}

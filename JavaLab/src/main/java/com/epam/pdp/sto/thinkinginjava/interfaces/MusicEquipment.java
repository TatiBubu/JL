package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 */
public class MusicEquipment implements Turntable, Mixer, Cdj, DjHardware {
    @Override
    public String toString() {
        return super.toString();
    }

    public void mix() {
        System.out.println("Mixing");
    }

    public void play() {
        System.out.println("Started playing");
    }

    public void stop() {
        System.out.println("Stopped playing");
    }

    public void addVolume(int vol) {
        System.out.println("Volume is higher for "
        + vol
        + " decibel");
    }

}

package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 */
public class DjequipmentDerivedFrom extends MusicEquipmentAbstract {

    void myMethod() {
        System.out.println("myMethod()");
    }

    static  void playTurntable(Turntable turn) {
        turn.play();
    }

    static void playCdj(Cdj cdj) {
        cdj.play();
    }

    static void playMixer(Mixer mix) {
        mix.mix();
    }

     void addVolume(DjHardware hard) {
        hard.addVolume(100500);
         this.myMethod();
    }

    public static void main(String[] args) {
        Djequipment equip = new Djequipment();
        final DjequipmentDerivedFrom der = new DjequipmentDerivedFrom();
        playTurntable(equip);
        playCdj(equip);
        playMixer(equip);
        der.addVolume(equip);
        DjequipmentDerivedFrom test = new DjequipmentDerivedFrom();
        test.mix();

    }
}

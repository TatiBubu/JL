package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 */
public class DjequipmentDerivedFromAbstract extends MusicEquipmentAbstract {
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

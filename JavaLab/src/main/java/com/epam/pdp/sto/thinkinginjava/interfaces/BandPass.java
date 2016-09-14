package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/12/2016.
 */
public class BandPass extends Filter {
    double lowCutoff;
           double highCutoff;

    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

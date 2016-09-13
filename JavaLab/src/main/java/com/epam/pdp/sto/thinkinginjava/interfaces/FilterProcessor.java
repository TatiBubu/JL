package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/12/2016.
 */
public class FilterProcessor {
    public static void main(String[] args) {

        Waveform wave = new Waveform();

        Apply.process(new FilterAdapter(new LowPass(1.0)), wave);
        Apply.process(new FilterAdapter(new HighPass(2.0)), wave);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), wave);
    }
}
/**Output:
 * Using Processor LowPass
 Waveform 0
 Using Processor HighPass
 Waveform 0
 Using Processor BandPass
 Waveform 0
 */


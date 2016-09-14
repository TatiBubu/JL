package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/8/2016.
 */
public interface Processor {
    String name();

    Object process(Object input);
}


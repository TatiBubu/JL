package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/8/2016.
 */
class Upcase extends StringProcess {
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

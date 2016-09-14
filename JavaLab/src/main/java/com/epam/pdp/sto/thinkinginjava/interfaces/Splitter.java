package com.epam.pdp.sto.thinkinginjava.interfaces;

import java.util.Arrays;

/**
 * Created by Tetyana_Stolyarova on 9/8/2016.
 */
public class Splitter extends StringProcess {

    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

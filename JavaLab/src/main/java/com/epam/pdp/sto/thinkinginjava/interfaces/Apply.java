package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/8/2016.
 */
public class Apply {
    public static void process(Processor pro, Object som) {
        System.out.println("Using Processor "
        + pro.name());
        System.out.println(pro.process(som));
    }
}

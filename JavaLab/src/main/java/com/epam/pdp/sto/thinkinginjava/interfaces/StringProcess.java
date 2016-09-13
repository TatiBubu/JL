package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/8/2016.
 */
public abstract class StringProcess implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String somStr = "If she weighs the same as a duck, she’s made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(), somStr);
        Apply.process(new Downcase(), somStr);
        Apply.process(new Splitter(), somStr);
    }

}

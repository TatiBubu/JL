package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/13/2016.
 */
/**
 * Cre
 * Exe
 * a S
 * of
 * the
 */

public class SwapperProcessor {
    public static void main(String[] args) {
        String string = "some String";
        Apply.process(new SwapperAdapter(new Swapper()), string);
    }
}
/**Output:
 * Using Processor SwapperAdapter
 osemS rtnig
 */

package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/13/2016.
 */
public  class SwapperAdapter implements Processor {
   public String name() {
       return getClass().getSimpleName();
   }

   Swapper swap;

public SwapperAdapter(Swapper swap) {
    this.swap = swap;
}

public String process(Object input) {
    return swap.process((String)input);
    }

}

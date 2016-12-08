package com.epam.pdp.sto.thinkinginjava.generics.exercises;

/**
 * Created by Best on 04.12.2016.
 */
class IntegerFactory implements FactoryI<Integer> {
    public Integer create(Integer intA) {
        return new Integer(intA);
    }
}

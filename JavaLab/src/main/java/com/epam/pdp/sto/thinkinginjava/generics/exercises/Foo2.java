package com.epam.pdp.sto.thinkinginjava.generics.exercises;

/**
 * to solve Ex23
 */
class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory, Integer intA) {
        x = factory.create(intA);
    }
}

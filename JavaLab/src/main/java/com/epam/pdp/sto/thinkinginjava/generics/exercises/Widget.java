package com.epam.pdp.sto.thinkinginjava.generics.exercises;
/**
 * additionl for Ex23;
 */

class Widget {
    int index;

    public static class Factory implements FactoryI<Widget> {
        public Widget create(Integer intA) {
            Widget widget = new Widget();
            widget.index = intA;
            return widget;
        }
    }
}

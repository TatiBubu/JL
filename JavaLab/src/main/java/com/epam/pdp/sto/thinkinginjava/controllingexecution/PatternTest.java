package com.epam.pdp.sto.thinkinginjava.controllingexecution;

class PatternTest {

    PatternTest() {}

    private static PatternTest pt1 = new PatternTest();

    public static PatternTest access() {
        return pt1;
    }

    public void fakemethod() {}
}

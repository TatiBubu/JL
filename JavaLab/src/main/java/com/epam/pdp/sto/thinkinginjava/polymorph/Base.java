package com.epam.pdp.sto.thinkinginjava.polymorph;

class Base {
    protected void method1() {
        System.out.println("method1()");
        this.method2();
    }

    protected void method2() {
        System.out.println("method2() called from base");

    }
}

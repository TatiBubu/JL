package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * ADD to Ex 10 : each class only has non-default constructors.
 */
public class StemEx10 extends RootEx10{

    StemEx10(int in) {
        super(in);
        System.out.println("Stem(int in); in = "
        + in);
    }

    Component1Ex10 c1 = new Component1Ex10(in,"str1");

    Component2Ex10 c2 = new Component2Ex10(in,"str2");

    Component3Ex10 c3 = new Component3Ex10(in, "str3");
}



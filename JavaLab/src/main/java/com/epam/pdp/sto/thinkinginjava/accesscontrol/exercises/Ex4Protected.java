package com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 */
public class Ex4Protected {
    private String sValue = "Ex4Protected String field";

    protected void showStringValue(String s1Value) {
        System.out.println(sValue + s1Value);
    }
}

package com.epam.pdp.sto.thinkinginjava.controllingexecution;

import com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises.Ex4Protected;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * Access Control > Exercise 4: (2) Show that protected methods have package access but are not public.
 */
public class Ex4OutOfPackageProtectMethodTest {
    public static void main(String[] args) {
        Ex4Protected testObj = new Ex4Protected(); //following method can not be execuetd from another package:
      //  testObj.showStringValue("+ s2Value");
    }
}


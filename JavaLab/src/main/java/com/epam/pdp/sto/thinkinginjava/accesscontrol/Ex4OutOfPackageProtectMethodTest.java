package com.epam.pdp.sto.thinkinginjava.accesscontrol;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 * (are not public verified in package com.epam.pdp.sto.thinkinginjava.controllingexecution >
 * Ex4OutOfPackageProtectMethodTest)
 */

public class Ex4OutOfPackageProtectMethodTest {
    public static void main(String[] args) {

        //Ex4Protected is a public class with protected method showStringValue;

        Ex4Protected testObj = new Ex4Protected();

        // protected method showStringValue can be accessed from same package:

        testObj.showStringValue(" + s2Value");
    }
}
/**Output:
 * Ex4Protected String field+ s2Value
 */


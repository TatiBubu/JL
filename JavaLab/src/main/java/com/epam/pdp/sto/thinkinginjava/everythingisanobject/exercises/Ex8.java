package com.epam.pdp.sto.thinkinginjava.everythingisanobject.exercises;

import com.epam.pdp.sto.thinkinginjava.interfaces.StringProcess;

/**
 * Exercise 8: (3) Write a program that demonstrates that, no matter how many objects you create of a particular class,
 * there is only one instance of a particular static field in that class.
 */
public class Ex8 {
    static int anint;

    static String astring;

    Ex8() {
        System.out.println("Ex8()");
    }

    public static void main(String[] args) {
        Ex8.anint = 20;
        Ex8 elem1 = new Ex8();
        Ex8 elem2 = new Ex8();
        elem1.anint = 21;
        elem2.astring = "static string";
        elem1.astring = elem2.astring + " concatenated";
        System.out.println("Ex8.anint = "
        + Ex8.anint
        + "; elem1.anint = "
        +  elem1.anint
        + "; Ex8.astring = "
        + Ex8.astring
        + "; elem2.astring = "
        + elem2.astring
        + "; elem1.astring =  "
        +  elem1.astring);
    }
}
/**Output:
 * Ex8()
 Ex8()
 Ex8.anint = 21; elem1.anint = 21; Ex8.astring = static string concatenated;
 elem2.astring = static string concatenated; elem1.astring =  static string concatenated
 */


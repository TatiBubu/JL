package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
        * Created by Best on 14.08.2016.
        * Helps to resolve Exercise 15 -> InstanceInitialization
 */
class Name{

    String s;

    {
        s = "String Initialization";
        System.out.println(s);
    }

    Name() {
        System.out.println("Name");
    }
}


/*Output:
* String Initialization
* Name
*/

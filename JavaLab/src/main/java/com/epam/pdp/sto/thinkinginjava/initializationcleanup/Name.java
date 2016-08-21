package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
        * Created by Best on 14.08.2016.
        * Exercise 15: (1) Create a class with a String that is initialized using instance initialization
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

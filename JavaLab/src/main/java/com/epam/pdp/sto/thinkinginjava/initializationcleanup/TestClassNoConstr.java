package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Tetyana_Stolyarova on 8/9/2016.
 * Exercise 7: (1) Create a class without a constructor,
 * and then create an object of that class in main( )
 * to verify that the default constructor is automatically synthesized.
 */

public class TestClassNoConstr {
    {
        System.out.println("not static block");
    }

    static     {
        System.out.println(" static block");
    }


    public static void main(String[] args) {

           TestClassNoConstr test = new TestClassNoConstr();
    }
}
/**Output:
 *  static bloc
 *  not static block
 *
 */

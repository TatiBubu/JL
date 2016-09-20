package com.epam.pdp.sto.thinkinginjava.everythingisanobject.exercises;

/**
 * Exercise 4: (1) Turn the DataOnly code fragments into a program that compiles and runs.
 * Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly
 * are assigned to and printed in main( ).
 */
public class Ex4 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("data.i = "
        + data.i
        + "; data.d = "
        +  data.d
        + "; data.b = "
        + data.b);
    }
}
/**Output:
 * data.i = 47; data.d = 1.1; data.b = false
 */

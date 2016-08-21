package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Best on 14.08.2016.
 * Exercise 19: (2) Write a method that takes a vararg String array.
 * Verify that you can pass either
 * a comma-separated list of Strings or a String[] into this method.
 */
public class Ex19 {
    public static void test(String... args) {
        for (String s : args) {
            System.out.println(s + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test("one","two");
        test(new String[]{"three","four"});
    }
}
/**Output:
 *  one

 two

 three

 four

 */

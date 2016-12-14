package com.epam.pdp.sto.thinkinginjava.strings.exercises;

/**
 * Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource,
 * write and test a regular expression
 * that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
public class Ex7 {
    public static void main(String[] args) {
        String ren = "^[A-Z].*[\\.]$";
        String s1 = "98";
        String s2 = "S87";
        String s3 = "A67643$%&^ #$ .";
        System.out.println(s1.matches(ren));
        System.out.println(s2.matches(ren));
        System.out.println(s3.matches(ren));
    }
}
/**Output:
 false
 false
 true
*/

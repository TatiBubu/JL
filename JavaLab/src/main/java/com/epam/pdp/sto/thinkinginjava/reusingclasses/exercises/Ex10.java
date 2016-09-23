package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.
 */
public class Ex10 {
    public static void main(String[] args) {
        StemEx10 ex10 = new StemEx10(10);
    }
}
/**Output:
 * Component1Ex10 constr with args:0; and str1
 Component2Ex10 constr with args:0; and str2
 Component3Ex10 constr with args:0; and str3
 RootEx10 constructor with argument:  10
 Component1Ex10 constr with args:10; and str1
 Component2Ex10 constr with args:10; and str2
 Component3Ex10 constr with args:10; and str3
 Stem(int in); in = 10
 */

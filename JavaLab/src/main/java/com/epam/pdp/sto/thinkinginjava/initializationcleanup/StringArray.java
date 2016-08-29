package com.epam.pdp.sto.thinkinginjava.initializationcleanup;

/**
 * Created by Best on 14.08.2016.
 * Exercise 16: (1) Create an array of String objects and assign a String to each element.
 * Print the array by using a for loop.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] arr = {"one", "two","three"};
        for (int index = 0; index < arr.length; index++) {
            System.out.println("arr[" + index + "]=" + arr[index]);
        }
    }
}
/*Output:
Exception in thread "main" arr[0]=one
arr[1]=two
arr[2]=three
java.lang.ArrayIndexOutOfBoundsException: 3
at com.epam.pdp.sto.thinkinginjava.initializationcleanup.StringArray.main(StringArray.java:12)
at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.lang.reflect.Method.invoke(Method.java:498)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 */


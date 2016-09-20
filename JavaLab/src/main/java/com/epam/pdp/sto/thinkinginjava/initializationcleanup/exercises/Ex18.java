package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

import com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises.StringArgsConstructor;

/**
 * Created by Best on 14.08.2016.
 * Exercise 18: (1) Complete the previous exercise
 * by creating objects to attach to the array of references.
 * Previous exercise is StringArgsConstructor class
 */
public class Ex18 {
    public static void main(String[] args)     {
        StringArgsConstructor[] arr = new StringArgsConstructor[]{
                new StringArgsConstructor("monday"),
                new StringArgsConstructor("tuesday"),
                new StringArgsConstructor("wednesday"),
                new StringArgsConstructor("thursday"),
                new StringArgsConstructor("friday")};
    }
}
/**Output:
 StringArgsConstructor
 monday
 StringArgsConstructor
 tuesday
 StringArgsConstructor
 wednesday
 StringArgsConstructor
 thursday
 StringArgsConstructor
 friday
 */

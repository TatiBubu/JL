package com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * Exercise 5: (2) Create a class with public, private, protected, and package-access fields and method members.
 * Create an object of this class and see what kind of compiler messages you
 * get when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 */
public class Ex5TestSamePackageApp {
    public static void main(String[] args) {
        Ex5AllPossibleTypesOfAccess test = new Ex5AllPossibleTypesOfAccess();
        test.intVal1 = 10;
        //test.intVal2 = 1 - not possible
        test.intVal3 = 100;
        test.intVal4 = 10;
        test.addVal1(2);
        //test.addVal2(1); - not possible;
        test.addVal3(4);
        test.addVal4(5);
    }
}

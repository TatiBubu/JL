package com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * Exercise 5: (2) Create a class with public, private, protected, and package-access fields and method members.
 * Create an object of this class and see what kind of compiler messages you get
 * when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 */
class Ex5AllPossibleTypesOfAccess {
    public int intVal1 = 1;
    private int intVal2 = 2;
    protected int intVal3 = 3;
    int intVal4 = 4;

    public void addVal1(int addVal1) {
        System.out.println(intVal1 + addVal1);
    }

    private void addVal2(int addVal2) {
        System.out.println(intVal2 + addVal2);
    }

    protected void addVal3(int addVal3) {
        System.out.println(intVal3 + addVal3);
    }

    void addVal4(int addVal4) {
        System.out.println(intVal4 + addVal4);
    }


    public static void setAllFields(String[] args) {
        Ex5AllPossibleTypesOfAccess testObj = new Ex5AllPossibleTypesOfAccess();
        testObj.intVal1 = 11;
        testObj.intVal2 = 12;
        testObj.intVal3 = 13;
        testObj.intVal4 = 14;
        testObj.addVal1(10);
        testObj.addVal2(100);
        testObj.addVal3(1000);
        testObj.addVal4(10000);
        System.out.println(testObj.toString());
    }
}


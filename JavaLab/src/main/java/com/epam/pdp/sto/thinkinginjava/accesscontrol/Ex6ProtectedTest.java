package com.epam.pdp.sto.thinkinginjava.accesscontrol;
//Exercise 6: (1) Create a class with protected data.   - Ex5AllPossibleTypesOfAccess CREATED; -
// Create a second class in the same file with a method that manipulates the protected data in the first class.
class Ex6ProtectedTest extends Ex5AllPossibleTypesOfAccess {
    Ex6ProtectedTest() {
        super.intVal3 = 10;
        super.addVal3(20);
    }

    public static void main(String[] args) {
        Ex6ProtectedTest testObject = new Ex6ProtectedTest();
        System.out.println(testObject.toString());
    }
}



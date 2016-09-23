package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;
//**      * Created by Best on 25.08.2016.
//        *  * Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle,
//        * which returns the number of wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
//        */
class Cycle {
    public void ride(int km) {
        System.out.println("Cycle rides " + km + " km;");
    }

    public void wheels() {
        System.out.println("from super");
    }
}





package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;
/**
 * Created by Best on 25.08.2016.
 * Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 * Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle,
 * which returns the number of wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
 */
public class CycleApp {
    public static void riding(Cycle somecycle) {
        somecycle.ride(25);
        somecycle.wheels();
    }

    public static void main(String[] args) {

        Unicycle first = new Unicycle();
        riding(first);

        Bicycle second = new Bicycle();
        riding(second);

        Tricycle third = new Tricycle();
        riding(third);
    }
}


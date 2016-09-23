package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/9/2016.
 * Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method.
 * This method should be overloaded based on various primitive data types, and print different types of barking,
 * howling, etc., depending on which overloaded version is called.
 * Write a main( ) that calls all the different versions.
 */
public class Dog {
    void bark(char variable) {
        System.out.println("bark of char: " + variable);
    }

    void bark(byte variable) {
        System.out.println("bark of byte: " + variable);
    }

    void bark(short variable) {
        System.out.println("bark of short: " + variable);
    }

    void bark(int variable) {
        System.out.println("bark of int: " + variable);
    }

    void bark(long variable) {
        System.out.println("bark of long: " + variable);
    }

    void bark(float variable) {
        System.out.println("bark of float: " + variable);
    }

    void bark(double variable) {
        System.out.println("bark of double: " + variable);
    }

    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.bark('a');
        puppy.bark((byte) 0);
        puppy.bark((short) 0);
        puppy.bark(1);
        puppy.bark(1L);
        puppy.bark(1.0f);
        puppy.bark(1.0);
    }
}
/**
 * Output:
 * bark of char: a
 * bark of byte: 0
 * bark of short: 0
 * bark of int: 1
 * bark of long: 1
 * bark of float: 1.0
 * bark of double: 1.0
 */

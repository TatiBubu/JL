package com.epam.pdp.sto.thinkinginjava.generics.exercises;

/**
 * Exercise 20: (1) Create an interface with two methods, (InterfaceTwoMethods)
 * and a class that implements that interface and adds another method.
 * (ImplInterfWithAddMethod)
 * In another class, create a generic method with an argument type that is bounded
 * by the interface, and show that the methods in the interface are callable inside
 * this generic method.
 * In main( ), pass an instance of the implementing class to the generic method.
 */
public class Ex20 {
    public static <T extends InterfaceTwoMethods> void delete(T arg) {
       arg.get();
       arg.set();
    }

    public static void main(String[] args) {
        InterfaceTwoMethods interf2meth = new ImplInterfWithAddMethod();
        Ex20.delete(interf2meth);
    }
}
/**Output:
 * ImplInterfWithAddMethod.get()
 * ImplInterfWithAddMethod.set()
 */


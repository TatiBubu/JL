package com.epam.pdp.sto.thinkinginjava.generics.exercises;

/**
 * part of Ex20: a class that implements that interface and adds another method
 */
public class ImplInterfWithAddMethod implements InterfaceTwoMethods {
  @Override
    public void get() {
      System.out.println("ImplInterfWithAddMethod.get()");
    }

   @Override
    public void set() {
       System.out.println("ImplInterfWithAddMethod.set()");
    }
    //another method added:
    public void edit() {
        System.out.println("ImplInterfWithAddMethod.edit()");
    }

}

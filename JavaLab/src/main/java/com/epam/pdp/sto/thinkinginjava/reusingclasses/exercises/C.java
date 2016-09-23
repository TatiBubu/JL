package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * Add to Ex5: Inherit a new class called C from A, and create a member of class B inside C.
 * Do not create a constructor for C. - ceated to resolve next Ex7 using same class (as added C(int val) constructor)
 * ADD to Ex7: Write a constructor for C and perform all initialization within C’s constructor.
 */
public class C extends A {
    int val;
    
    C() {
        System.out.println("C()");
    }

C(int val) {
super(val);
    this.val = val;
    System.out.println("C(int val)"
    + val);
    B someb = new B();
}


}



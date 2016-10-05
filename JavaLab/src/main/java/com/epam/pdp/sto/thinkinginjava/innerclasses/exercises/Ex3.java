package com.epam.pdp.sto.thinkinginjava.innerclasses.exercises;

/**
 * Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field (initialized by the constructor),
 * and Inner has a toString( ) that displays this field.
 * Create an object of type Inner and display it.
 * class Ex3 equals class Outer
 */
public class Ex3 {
    private String str;

    Ex3(String str) {
        System.out.println("Outer (String str)");
        this.str = str;
    }

    class Inner3 {
        Inner3() {
            System.out.println("Inner()");
        }

        public String toString() {
            return str;
        }
    }

    public Inner3 returnInner() {
        return new Inner3();
    }

    public static void main(String[] args) {
        Ex3 item = new Ex3("Exercise 3");
        Ex3.Inner3 itemIn = item.returnInner();
        System.out.println(itemIn);
    }
}
/**Output:
 * Outer (String str)
 Inner()
 Exercise 3
 */

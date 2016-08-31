package com.epam.pdp.sto.thinkinginjava.polymorph;
/*Exercise 11: (1) Add class Pickle to Sandwich.java.
*/

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
} /* Output:
*/

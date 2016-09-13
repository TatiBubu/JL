package com.epam.pdp.sto.thinkinginjava.polymorph;
/*Exercise 11: (1) Add class Pickle to Sandwich.java.
*/

//public class Sandwich extends PortableLunch {
//    private Bread b = new Bread();
//    private Cheese c = new Cheese();
//    private Lettuce l = new Lettuce();
//    private Pickle p = new Pickle();
//
//    public Sandwich() {
//        System.out.println("Sandwich()");
//    }
//
//    public static void main(String[] args) {
//        new Sandwich();
//    }
//} /* Output:
//*/

/* Exercise 8: (2) In polymorphism.Sandwich.java, create
an interface called FastFoo d (with appropriate methods)
and change Sandwic h so that it also implements FastFood.
* */

public class Sandwich implements FastFood {
    public void prepare() {
         Bread bread = new Bread();
         Cheese cheese = new Cheese();
         Lettuce lettuce = new Lettuce();
         Pickle pickle = new Pickle();
        System.out.println("Is fast food healthy? - "
                + healthy);

    }

    public Sandwich() {
        System.out.println("Sandwich():");
        prepare();
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

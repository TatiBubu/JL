package com.epam.pdp.sto.thinkinginjava.interfaces.exercises;
/**Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract class.
 * Make the methods of Rodent abstract whenever possible.
 * */

/*abstract class Rodent {
    public abstract void cave();

    public abstract void jump();

    public String toString() {
       return "Rodent";
    }
}*/


/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 * Exercise 9: (3) Create an inheritance hierarchy of Rodent:
 * Mouse, Gerbil, Hamster, etc. In the base class, provide methods that are common to all Rodents,
 * and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
 * Create an array of Rodent, fill it with different specific types of Rodents,
 * and call your base-class methods to see what happens.
 */

/* Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter
* so that Rodent is an interface.
*/

public interface Rodent1 {
     void cave();

    void jump();

}




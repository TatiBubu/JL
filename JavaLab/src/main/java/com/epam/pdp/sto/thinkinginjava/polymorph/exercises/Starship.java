package com.epam.pdp.sto.thinkinginjava.polymorph.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 * Exercise 16: (3) Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the states.
 */

public class Starship {
    public static void main(String[] args) {
        StarshipChangeState starship = new StarshipChangeState();
        starship.shipMove();
        starship.move();
        starship.shipMove();
        starship.stop();
        starship.shipMove();
    }
}
/*Output:
* Starship starts...
Starship moves...
Starship stops...
*/

package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/12/2016.
 * Exercise 12: (4) Create a class called Tank that can be filled and emptied,
 * and has a termination condition that it must be empty when the object is cleaned up.
 * Write a finalize( ) that verifies this termination condition.
 * In main( ), test the possible scenarios that can occur when your Tank is used.
 */
public class Tank {  // Class called Tank that can be filled and emptied
    boolean empty = true;

    Tank(boolean room) {
        empty = room;
    }
    // Method for proper clean up:
    void setEmpty() {
        empty = true;
    }
    //finalize( ) that verifies this termination condition that Tank must be empty when the object is cleaned up
protected void finalizeTank() {
    if (!empty) {
        System.out.println("Error: Tank is not empty!");
    }
}
//In main( ), test the possible scenarios that can occur when your Tank is used:
public static void main(String[] args) {
    Tank tank = new Tank(true);
    Tank tank2 = new Tank(false);
    //Proper cleanup:
    tank2.setEmpty();
    // Drop the reference, forget to clean up:
    new Tank(false);
    // Force garbage collection & finalization:
    System.gc();
 }
}
/**Output:
 * Error: Tank is not empty!
 */


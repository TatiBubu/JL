package com.epam.pdp.sto.thinkinginjava.interfaces.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/30/2016.
 */
//public class Mouse extends Rodent {
//@Override public void cave() {
//    System.out.println("Mouse id caving");
//}
//
//@Override public void jump() {
//    System.out.println("Mouse Jump()");
//}
//
//@Override public String toString() {
//   return "Mouse";
//}
//}

public class Mouse implements Rodent1 {
    public void cave() {
        System.out.println("Mouse id caving");
    }

   public void jump() {
        System.out.println("Mouse Jump()");
    }

 public String toString() {
        return "Mouse";
    }
}



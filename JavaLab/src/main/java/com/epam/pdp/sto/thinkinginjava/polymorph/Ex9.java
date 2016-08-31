package com.epam.pdp.sto.thinkinginjava.polymorph;
/**
 * Created by Best on 30.08.2016.
 * Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
 */

public class Ex9 {
    public static void main(String[] args) {
        RandomRodentGeneration gen = new RandomRodentGeneration();
        Rodent[] rodentArr = new Rodent[5];
// Fill up the array with instruments:
        for (int i = 0; i < rodentArr.length; i++) {
            rodentArr[i] = gen.next();
        }
// Make polymorphic method calls:
        for (Rodent rod : rodentArr) {
            rod.cave();
        }
        for (Rodent rod : rodentArr) {
            System.out.println(rod);
        }
        for (Rodent rod : rodentArr) {
            rod.jump();
        }
    }
}
//* Output:
//Mouse id caving
//        Mouse id caving
//        Rodent is caving
//        Rodent is caving
//        Mouse id caving
//        Mouse
//        Mouse
//        Rodent
//        Rodent
//        Mouse
//        Rodent is jumping
//        Rodent is jumping
//        Gerbil is jumping
//        Rodent is jumping
//        Rodent is jumping





package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Created by Tetyana_Stolyarova on 11/11/2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] stringArr = new int[2];
        int index = 3;
        while (true) {
            try {
                stringArr[index] = index;
                    System.out.println("stringArr["
                            + index
                            + "] = "
                            + stringArr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException excep) {
                excep.printStackTrace(System.out);
                index--;
            }
        }

        System.out.println("End of while");
    }
}
/*
java.lang.ArrayIndexOutOfBoundsException: 3

java.lang.ArrayIndexOutOfBoundsException: 2

stringArr[1] = 1
End of while
 */

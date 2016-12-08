package com.epam.pdp.sto.thinkinginjava.errorhandling.exercises;

/**
 * Exercise 3: (1) Write code to generate and catch an ArraylndexOutOfBoundsException.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] stringArr = new int[3];
        try {
            for (int index = 0; index < 4; index++) {
                stringArr[index] = index;
                System.out.println("stringArr["
                        + index
                        + "] = "
                        + stringArr[index]);
            }
        } catch (ArrayIndexOutOfBoundsException excep) {
            excep.printStackTrace(System.out);
        }
    }
}
/*Output:
stringArr[0] = 0
stringArr[1] = 1
stringArr[2] = 2
java.lang.ArrayIndexOutOfBoundsException: 3
 */

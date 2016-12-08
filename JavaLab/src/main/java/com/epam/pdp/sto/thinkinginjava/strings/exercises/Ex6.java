package com.epam.pdp.sto.thinkinginjava.strings.exercises;
/**
 * Exercise 6: (2) Create a class that contains int, long, float and double fields.
 * Create a toString( ) method for this class that uses String.format( ), a
 * nd demonstrate that your class works correctly.
 */
public class Ex6 {
    private int intVal = 121;
    private long longVal = 300L;
    private float floatVal = 23.460054f;
    double doubleVal =  1.39e-38f;

    public String toString() {
        return String.format("String.format for int %3d, long %3d, float %5.2f, double %-7.3e\n",
                intVal, longVal,floatVal,doubleVal);
    }

    public static void main(String[] args) {
        Ex6 ex6Obj = new Ex6();
        System.out.println(ex6Obj);
    }
}
/**Output:
 *String.format for int 121, long 300, float 23,46, double 1,390e-38
 */



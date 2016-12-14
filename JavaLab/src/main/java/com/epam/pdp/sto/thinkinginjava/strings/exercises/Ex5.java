package com.epam.pdp.sto.thinkinginjava.strings.exercises;

import com.epam.pdp.sto.thinkinginjava.strings.Conversion;

import java.math.BigInteger;
import java.util.Formatter;

/**
 * Exercise 5: (5) For each of the basic conversion types in the above table,
 * write the most complex formatting expression possible.
 * That is, use all the possible format specifiers available for that conversion type.
 */
public class Ex5 {
    public static void main(String[] args) {
        Formatter form = new Formatter(System.out);
        char charVal = 'a';
        System.out.println("charVal = \'a\'\t");
        form.format("%-2c%-5b%-2s\n",
                charVal, charVal,charVal);

        int intVal = 121;
        System.out.println("intVal = 121");
        form.format("%-4d%-2c%-5b%-4s%-4x\t%2h\n",
                intVal,intVal,intVal,intVal,intVal,intVal);

        BigInteger bigIntVal = new BigInteger("50000000000000");
        System.out.println(
                "bigIntVal = new BigInteger(\"50000000000000\")");
        form.format("%-16d%-5b%-16s%14x%14h\n", bigIntVal,bigIntVal,bigIntVal,bigIntVal,bigIntVal);

        double doubleVal = 179.543;
        System.out.println("doubleVal = 179.543");
        form.format("%-5b%10s%-10f%-15e%-7h\n", doubleVal,doubleVal,doubleVal,doubleVal,doubleVal);

        Conversion conversion = new Conversion();
        System.out.println("Conversion conversion = new Conversion()");
        form.format("%-6b%-20s%9h\n", conversion,conversion,conversion);

        boolean boolVal = false;
        System.out.println("boolean boolVal = false");
        form.format("%-6b%-6s%-4h\n", boolVal,boolVal,boolVal);
    }
}
/*Output:
charVal = 'a'
a true a
intVal = 121
121 y true 121 79 79
bigIntVal = new BigInteger("50000000000000")
50000000000000  true 50000000000000    2d79883d2000      8842a1a7
doubleVal = 179.543
true    179.543179,5430001,795430e+02   1ef462c
Conversion conversion = new Conversion()
true  strings.Conversion@5cad8086 5cad8086
boolean boolVal = false
false false 4d5
 */



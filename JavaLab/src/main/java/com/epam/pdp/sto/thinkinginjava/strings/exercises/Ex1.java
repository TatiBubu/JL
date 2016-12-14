package com.epam.pdp.sto.thinkinginjava.strings.exercises;

import com.epam.pdp.sto.thinkinginjava.strings.WaterSource;

/**
 * Exercise 1: (2) Analyze SprinklerSystem.toString( ) in reusing/SprinklerSystem.java
 * to discover whether writing the toString( )
 * with an explicit StringBuilder will save any StringBuilder creations.
 *
 */
public class Ex1 {
    private String valve1;
    private String valve2;
    private String valve3;
    private String valve4;
    private WaterSource source = new WaterSource();
    private int anInt;
    private float aFloat;

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        result.append(valve1);
        result.append(", ");
        result.append(valve2);
        result.append(", ");
        result.append(valve3);
        result.append(", ");
        result.append(valve4);
        result.append(", ");
        result.append(anInt);
        result.append(", ");
        result.append(aFloat);
        result.append(", ");
        result.append(source);
        result.append("]");
return result.toString();
    }

    public static void main(String[] args) {
        Ex1 ex1Obj = new Ex1();
        System.out.println(ex1Obj);
    }
}
/*Output:
WaterSource()
[null, null, null, null, 0, 0.0, Constructed]
 */

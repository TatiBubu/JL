package com.epam.pdp.sto.thinkinginjava.strings.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 2: (1) Repair InfiniteRecursion.java.
 */
public class Ex2 {
    public String toString() {
        return "Ex2: " + super.toString();
    }

    public static void main(String[] args) {
        List<Ex2> arrLEx2 = new ArrayList<Ex2>();
        for (int index = 0; index < 10; index++) {
            arrLEx2.add(new Ex2());
        }
        System.out.println(arrLEx2);
    }
}
/*Output:
[Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@1b6d3586,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@4554617c,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@74a14482,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@1540e19d,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@677327b6,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@14ae5a5,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@7f31245a,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@6d6f6e28,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@135fbaa4,
Ex2: com.epam.pdp.sto.thinkinginjava.strings.exercises.Ex2@45ee12a7]
 */

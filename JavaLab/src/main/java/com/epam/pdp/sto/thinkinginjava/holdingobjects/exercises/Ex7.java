package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.List;
import java.util.*;
/**
 * Exercise 7: (3) Create a class, then make an initialized array of objects of your class.
 * Fill a List from your array. Create a subset of your List by using subList( ),
 * then remove this subset from your List.
 */
public class Ex7 {
    int number;

    Ex7(int number) {
        this.number = number;
        System.out.println("Ex7()"
                + number);
    }

    public static void main(String[] args) {
        Ex7[] arr = new Ex7[4];

        for (int it = 0; it < arr.length; it++) {
            arr[it] = new Ex7(it);
        }

        List<Ex7> list = new ArrayList<Ex7>();

        for (Ex7 count : arr) {
            list.add(count);
        }

        System.out.println("list: "
                + list );

        List<Ex7> sub =  list.subList(1, 3);

        System.out.println("sub: "
                + sub);
        list.removeAll(sub);
        System.out.println("list after sub removed: "
                + list);

    }
}
/**Output:
 * Ex7()0
 Ex7()1
 Ex7()2
 Ex7()3
 list: [exercises.Ex7@1540e19d, exercises.Ex7@677327b6, exercises.Ex7@14ae5a5, exercises.Ex7@7f31245a]
 sub: [exercises.Ex7@677327b6, exercises.Ex7@14ae5a5]
 list after sub removed: [exercises.Ex7@1540e19d, exercises.Ex7@7f31245a]
 */


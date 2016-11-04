package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


/**
 * Exercise 12: (3) Create and populate a List of Integer.
 * Create a second List of Integer of the same size as the first,
 * and use ListIterators to read elements from the first List and insert them into the second in reverse order.
 * (You may want to explore a number of different ways to solve this problem.)
 */
public class Ex12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(6,7,8,9,0));

        System.out.println("list: "
        + list);
        System.out.println("list2: "
        + list2);

        ListIterator<Integer> it = list.listIterator(5);

        ListIterator<Integer> it2 = list2.listIterator();

        while (it2.hasNext()) {
            it2.next();
            it2.set(it.previous());
        }
        System.out.println("list: "
                + list);
        System.out.println("list2: "
                + list2);
    }
}
/*Output:
list: [1, 2, 3, 4, 5]
list2: [6, 7, 8, 9, 0]
list: [1, 2, 3, 4, 5]
list2: [5, 4, 3, 2, 1]
*/


package com.epam.pdp.sto.thinkinginjava.controllingexecution;

/**
 * Exercise 6: (2) Modify the two test( ) methods in the previous two programs so that they take two extra arguments,
 * begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.
 */
public class ReturnExersice6 {
    static boolean test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (test(10, 5, 1)) {
            System.out.println(" is beetween ");
        } else {
            System.out.println(" is not beetween ");
        }

    }
}

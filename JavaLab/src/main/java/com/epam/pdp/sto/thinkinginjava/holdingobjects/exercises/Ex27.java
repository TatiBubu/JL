package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.Queue;

/**
 * Exercise 27: (2) Write a class called Command that contains a String and
 * has a method operation( ) that displays the String.
 * Write a second class with a method that fills a Queue with Command objects
 * and returns it. Pass the filled Queue to a method in a third class that consumes
 * the objects in the Queue and calls their operation( ) methods.
 */
public class Ex27 {
    public static void callOp(Queue<Command> que) {
        while (que.peek() != null) {
            que.poll().operation();
        }
    }

    public static void main(String[] args) {
        FillQueue fq = new FillQueue();
        callOp(fq.fillQ());
    }
}
/*Output:
0
1
2
3
4
5
6
7
8
9
 */


package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Additional to Ex27: Write a second class with a method
 * that fills a Queue with Command objects and returns it.
 */
public class FillQueue {
    Queue<Command> fillQ() {
        Queue<Command> qc = new LinkedList<Command>();

        for (int ind = 0; ind < 10; ind++) {
            qc.offer(new Command(ind + " "));
        }
        return qc;
    }
}

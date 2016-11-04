package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;
// Making a stack from a LinkedList.
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T val) {
        storage.addFirst(val);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}


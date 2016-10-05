package com.epam.pdp.sto.thinkinginjava.innerclasses.exercises;

/**
 * Exercise 4: (2) Add a method to the class Sequence.SequenceSelector
 * that produces the reference to the outer class Sequence.
 * Follow methEx4() Sequence.java file.
 */

public class Sequence {
  private Object[] items;
  private int next = 0;

  public Sequence(int size) {
    items = new Object[size];
  }

  public void add(Object obj) {
    if (next < items.length) {
        items[next++] = obj;
    }
  }

  private class SequenceSelector implements Selector {
    private int i = 0;

    public boolean end() {
      return i == items.length;
    }

    public Object current() {
      return items[i];
    }

    public void next() {
      if (i < items.length) {
          i++;
      }
      }
      //Exercise 4: (2) Add a method to the class Sequence.SequenceSelector
      // that produces the reference to the outer class Sequence.
      public Sequence methEx4() {
          return Sequence.this;
      }
    }


  public Selector selector() {
    return new SequenceSelector();
  }

  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for (int i = 0; i < 10; i++) {
        sequence.add(Integer.toString(i));
    }
    Selector selector = sequence.selector();
    while (!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

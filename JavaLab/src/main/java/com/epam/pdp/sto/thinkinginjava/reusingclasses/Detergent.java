package com.epam.pdp.sto.thinkinginjava.reusingclasses;//: reusing/Detergent.java
// Inheritance syntax & pr

public class Detergent extends Cleanser {
  // Change a method:
  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // Call base-class version
  }
  // Add methods to the interface:
  public void foam() {
    append(" foam()");
  }
  // Test the new class:
  public static void main(String[] args) {
    Detergent ax = new Detergent();
    ax.dilute();
    ax.apply();
    ax.scrub();
    ax.foam();
    System.out.println(ax);
    System.out.println("Testing base class:");
    Cleanser.main(args);
  }
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~

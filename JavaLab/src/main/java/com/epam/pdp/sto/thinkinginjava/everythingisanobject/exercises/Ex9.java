package com.epam.pdp.sto.thinkinginjava.everythingisanobject.exercises;

/**
 * Exercise 9: (2) Write a program that demonstrates that autoboxing works
 * for all the primitive types and their wrappers.
 */
public class Ex9 {
      public static void main(String[] args) {
          Boolean boo = true;
          boolean bool = boo;
          Character cha = 't';
          char achar = cha;
          Byte byt = 10;
          byte abyte = byt;
          Short sho = 12345;
          short shor = sho;
          Integer inte = 123456;
          int anint = inte;
          Long lon = 345678910L;
          long alon = lon;
          Float flo = 1.5F;
          float aflo = flo;
          Double dou = 10.10;
          double dob = dou;
          System.out.println("Boolean = "
        + boo
        + "; boolean = "
        + bool
        + "; Character = "
          + cha
          + "; char = "
          + achar
          + "; Byte = "
          + byt
          + "; byte = "
          + abyte
          + "; Short = "
          + sho
          + "; short = "
          + shor
          + "; Integer = "
          + inte
          + "; int = "
          + inte
          + "; Long = "
          + lon
          + "; long = "
          + alon
          + "; Float = "
          + flo
          + "; float = "
          + aflo
          + "; Double = "
          + dou
          + "; double = "
          + dob);
    }


}
/**Output:
 * Boolean = true; boolean = true; Character = t; char = t; Byte = 10; byte = 10; Short = 12345; short = 12345;
 * Integer = 123456; int = 123456; Long = 345678910; long = 345678910;
 * Float = 1.5; float = 1.5; Double = 10.1; double = 10.1
 */

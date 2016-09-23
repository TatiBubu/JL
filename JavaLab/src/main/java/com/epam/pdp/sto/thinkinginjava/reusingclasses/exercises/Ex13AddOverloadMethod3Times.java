package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 * ADD toExercise 13: (2) Create a class with a method that is overloaded three times.
 */
public class Ex13AddOverloadMethod3Times {
    char methodOv(char ch) {
        System.out.println("methodOv(char ch)");
        return 'm';
    }

    float methodOv(float fl) {
        System.out.println("methodOv(float fl)");
        return 1.1F;
    }

    String methodOv(String str) {
        System.out.println("methodOv(String str)");
        return "Str";
    }
}

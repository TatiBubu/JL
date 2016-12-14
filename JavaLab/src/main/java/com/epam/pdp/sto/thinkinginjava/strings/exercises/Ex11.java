package com.epam.pdp.sto.thinkinginjava.strings.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise 11: (2) Apply the regular expression
 (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
 to
 "Arline ate eight apples and one orange while Anita hadn’t any"
 */
public class Ex11{
    public static void main(String[] args) {
    String string = "Arline ate eight apples and one orange while Anita hadn’t any";
    Pattern pattern = Pattern.compile(" (?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
    Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());
    }
}

package com.epam.pdp.sto.thinkinginjava.reusingclasses.exercises;

/**
 *Exercise 12: (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 */
public class Ex12 {
    public static void main(String[] args) {
        Stem st = new Stem();
        try {
            // Code and exception handling...
        } finally {
            st.dispose();
        }
    }
}
/**Output:
 *  Component1()
 Component2()
 Component3()
 Root()
 Component1()
 Component2()
 Component3()
 Stem()
 Component1.dispose()
 Component2.dispose()
 Component3.dispose()
 Root.dispose()
 Component1.dispose()
 Component2.dispose()
 Component3.dispose()
 Stem.dispose()
 */




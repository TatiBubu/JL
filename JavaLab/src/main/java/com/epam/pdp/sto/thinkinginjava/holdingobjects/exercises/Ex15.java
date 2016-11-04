package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;
/**
 * Exercise 15: (4) Stacks are often used to evaluate expressions in programming languages.
 * Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push the following
 * letter onto the stack,"
 * and’-’ means "pop the top of the stack and print it":
 * "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */
public class Ex15 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        st.push('U');
        st.push('n');
        st.push('c');
        System.out.println(st.pop());
        st.push('e');
        st.push('r');
        st.push('t');
        System.out.println(st.pop());
        st.push('a');
        System.out.println(st.pop());
        st.push('i');
        System.out.println(st.pop());
        st.push('n');
        st.push('t');
        st.push('y');
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(' ');
        System.out.println(st.pop());
        st.push('r');
        st.push('u');
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push('l');
        st.push('e');
        st.push('s');
        System.out.println(st.pop());
        System.out.println(st);
    }
}
/* Output:
c
t
a
i
y
t

u
r
s
[e, l, n, r, e, n, U]
 */


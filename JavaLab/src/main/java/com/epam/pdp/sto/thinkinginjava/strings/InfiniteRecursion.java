package com.epam.pdp.sto.thinkinginjava.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tetyana_Stolyarova on 11/30/2016.
 */
public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> vi =
                new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            vi.add(new InfiniteRecursion());
        }
        System.out.println(vi);
    }
}

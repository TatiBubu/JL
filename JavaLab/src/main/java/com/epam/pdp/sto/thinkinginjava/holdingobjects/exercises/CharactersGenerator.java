package com.epam.pdp.sto.thinkinginjava.holdingobjects.exercises;
/**
 * Additional to Ex4 class
 */

import java.util.Collection;
import java.util.Map;

public class CharactersGenerator {
    int it = 0;

    public String next() {
        switch (it) {
            default:
            case 0 : it++;
                return "Joan";
            case 1 : it++;
                return "Mathey";
            case 2 : it++;
                return "Marco";
            case 4 : it = 0;
                return "Luca";
        }
    }

    public void fill(String[] arr) {
        for (int index = 0; index < arr.length; index++) {
            arr[index] = next();
        }
    }

    public Collection fill(Collection<String> collection, int size) {
        for (int index = 0; index < size; index++) {
            collection.add(next());
        }
        return collection;
    }
}


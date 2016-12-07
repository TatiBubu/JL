package com.epam.pdp.sto.thinkinginjava.generics.exercises;

import java.util.ArrayList;

/**
 * additionl for Ex19;
 */
public class CargoShip extends ArrayList<Warehouse> {
    public CargoShip(int numWarh, int numUnits, int numCont) {
        for (int index = 0; index < numWarh; index++) {
            add(new Warehouse(numUnits, numCont));
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Warehouse warehouse : this) {
            for (Unit unit : warehouse) {
                for (Container container : unit) {
                    result.append(container);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }
}

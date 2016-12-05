package com.epam.pdp.sto.thinkinginjava.generics.exercises;

import java.util.ArrayList;

/**
 * additionl for Ex19;
 */

public class Warehouse extends ArrayList<Unit> {
    public Warehouse(int numUnit, int numCont) {
      for (int index = 0; index < numUnit; index++) {
          add(new Unit(numCont));
      }
}
}

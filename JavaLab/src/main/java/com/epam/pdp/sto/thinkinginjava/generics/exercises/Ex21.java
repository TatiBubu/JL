package com.epam.pdp.sto.thinkinginjava.generics.exercises;

import com.epam.pdp.sto.thinkinginjava.generics.Building;
import com.epam.pdp.sto.thinkinginjava.generics.House;

import java.util.HashMap;
import java.util.Map;

// Exercise 21: (4) Modify ClassTypeCapture.java by adding a Map'<String,'Class<?>>,
/**
 * a method addType(String typename, Class<?> kind), and a method
 * createNew(String typename). createNew( ) will either produce a new instance
 * of the class associated with its argument string, or produce an error message. *
 */
public class Ex21<T> {
    Class<T> kind;
    private Map<String, Class<?>> map;

    public Ex21(Class<T> kind) {
        this.kind = kind;
    }

    public Ex21(Class<T> kind, Map<String, Class<?>> map) {
        this(kind);
        this.map = map;
    }

    public boolean isInst(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    public Object createNew(String typename) throws IllegalAccessException,
            InstantiationException {
        if (map.containsKey(typename)) {
            return map.get(typename).newInstance();
        } else {
            System.out.println("No such class: " + typename);
                return null;
        }
    }

    public static void main(String[] args) {
        Ex21<Building> ex21 =
                new Ex21<Building>(Building.class,new HashMap<String, Class<?>>());
        ex21.addType("Building", Building.class);
        ex21.addType("House", House.class);
        try {
            Building build = (Building)ex21.createNew("Building");
            House unit = (House)ex21.createNew("House");
            Warehouse warh = (Warehouse)ex21.createNew("Warehouse");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

package com.epam.pdp.sto.thinkinginjava.strings;

/**
 * Created by Tetyana_Stolyarova on 11/30/2016.
 */
public class SprinklerSystem {
    private String valve1;
    private String valve2;
    private String valve3;
    private String valve4;
    private WaterSource source = new WaterSource();
    private int anInt;
    private float aFloat;

    public String toString() {
        return
                "valve1 = " + valve1 + " "
                        +
                        "valve2 = " + valve2 + " "
                        +
                        "valve3 = " + valve3 + " "
                        +
                        "valve4 = " + valve4 + "\n"

                        +
                        "int = " + anInt + " " + "aFloat = " + aFloat + " "
                        + "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

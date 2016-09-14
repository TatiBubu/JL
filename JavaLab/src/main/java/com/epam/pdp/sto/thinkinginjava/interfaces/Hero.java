package com.epam.pdp.sto.thinkinginjava.interfaces;

/**
 * Created by Tetyana_Stolyarova on 9/14/2016.
 */
class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly, CanClimb {

    public void swim() {}

    public void fly() {}

    public void climb() {}
}


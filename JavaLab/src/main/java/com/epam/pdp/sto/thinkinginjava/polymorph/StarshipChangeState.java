package com.epam.pdp.sto.thinkinginjava.polymorph;

class StarshipChangeState {

    private AlertStatus status = new StartState();

    public void move() {
        status = new MoveState();
    }

    public void stop() {
        status = new StopState();
    }

    public void shipMove() {
        status.state();
    }
}

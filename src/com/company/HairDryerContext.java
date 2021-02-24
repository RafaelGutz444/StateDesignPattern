package com.company;

public class HairDryerContext implements State{
    public State HairDryerState;


    public void setState(State state) {

        this.HairDryerState = state;
    }


    public State getState() {

        return this.HairDryerState;
    }


    @Override
    public void GetPower() {
        this.HairDryerState.GetPower();

    }
}

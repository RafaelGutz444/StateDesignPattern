package com.company;

public class Main{

    public static void main(String[] args) {
        HairDryerContext context = new HairDryerContext();

        HighState HighState = new HighState();
        context.setState(HighState);
        context.GetPower();



        MediumState MediumState = new MediumState();
        context.setState(MediumState);
        context.GetPower();



        LowState LowState = new LowState();
        context.setState(LowState);
        context.GetPower();
    }
}

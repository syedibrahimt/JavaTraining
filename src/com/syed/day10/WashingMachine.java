package com.syed.day10;

public class WashingMachine extends Appliance{
    public WashingMachine(String name) {
        super(name);
    }

    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}

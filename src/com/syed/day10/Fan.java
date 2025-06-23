package com.syed.day10;

public class Fan extends Appliance{
    public Fan(String name) {
        super(name);
    }

    @Override
    public String start() {
        return "Fan is running";
    }
}

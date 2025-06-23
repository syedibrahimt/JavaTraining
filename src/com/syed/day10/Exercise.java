package com.syed.day10;

public class Exercise {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing machine");
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}

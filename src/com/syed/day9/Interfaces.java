package com.syed.day9;

public class Interfaces {
    public static void main(String[] args) {
        ICalc calc = new Calculator();
        System.out.println(calc.add(2,2));
        System.out.println(calc.sub(2,2));
        System.out.println(calc.mult(2,2));
        System.out.println(calc.div(2,2));
    }
}

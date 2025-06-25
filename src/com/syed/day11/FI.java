package com.syed.day11;

@FunctionalInterface
interface ICalc {
    int add(int num1, int num2);
}

public class FI {
    public static void main(String[] args) {
        ICalc iCalc = new ICalc() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println(iCalc.add(2, 8));
    }
}

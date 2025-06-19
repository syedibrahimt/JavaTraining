package com.syed.day4;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int add = calc.add(2,3);
        int sub =calc.sub(4,1);
        int mul = calc.mul(4,5);
        int div = calc.div(4,2);
        double doubleAdd = calc.add(2,2.4,2);
    }
}

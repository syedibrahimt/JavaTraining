package com.syed.day11;

@FunctionalInterface
interface ICar {
    String drive();
}

public class LamdaExpression {
    public static void main(String[] args) {
        ICar car = () -> "Car is driving";
        System.out.println(car.drive());
    }
}

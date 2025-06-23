package com.syed.day9;

class Car {
    public void drive(){
        System.out.println("Driving Car");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car c = new Car(){
            public void drive() {
                System.out.println("Driving Huyndai car");
            }
        };
        c.drive();
    }
}

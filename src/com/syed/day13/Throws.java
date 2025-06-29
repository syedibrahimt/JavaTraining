package com.syed.day13;

class Car {
    public void drive() throws ClassNotFoundException {
        Class.forName("BMW");
    }
}

public class Throws {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.drive();
        } catch (ClassNotFoundException cnf) {
            System.out.println("Exception Handled By Throws");
            cnf.printStackTrace();
        }
    }
}

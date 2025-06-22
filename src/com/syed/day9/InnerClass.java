package com.syed.day9;

class A {
    public void show() {
        System.out.println("In A show");
    }
    class B {
        public void show() {
            System.out.println("In B show");
        }
    }
}

class Vehicle {
    public void drive(){
        System.out.println("Drive");
    }
    static class Car {
        public static void stop() {
            System.out.println("Apply brakes");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.show();
        Vehicle.Car.stop();
    }
}
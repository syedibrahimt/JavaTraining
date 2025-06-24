package com.syed.day8;

abstract class Car {
    public abstract void drive();
    public abstract void playWelcomeMusic();
    public void applyBrake() {
        System.out.println("Brake Applied");
    }
}

class Creta extends Car {

    @Override
    public void drive() {
        System.out.println("Driving Hyundai car");
    }

    @Override
    public void playWelcomeMusic() {
        System.out.println("Playing Hyundai Welcome music");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car car = new Creta();
        car.drive();
        car.playWelcomeMusic();
        car.applyBrake();
    }
}

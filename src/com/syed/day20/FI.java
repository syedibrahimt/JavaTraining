package com.syed.day20;

@FunctionalInterface
interface Greet {
    void welcome();
}

public class FI {
    public static void main(String[] args) {
        Greet g = () -> {
            System.out.println("Welcome to the world of Java");
        };
        g.welcome();
    }
}

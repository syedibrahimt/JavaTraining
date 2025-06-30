package com.syed.day13;

public class UsingRunnable {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Bye");
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}

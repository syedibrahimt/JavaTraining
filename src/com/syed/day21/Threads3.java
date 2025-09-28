package com.syed.day21;

public class Threads3 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
                for (int i=0; i<5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
        };
        Runnable r2 = () -> {
            for (int i=0; i<5; i++) {
                System.out.println("Bye");
                try {
                    Thread.sleep(10);
                }catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}

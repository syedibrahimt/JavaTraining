package com.syed.day13;

class Men extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Man is running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Women extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Woman is running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsIntro {
    public static void main(String[] args) {
        Men m = new Men();
        Women w = new Women();
        w.setPriority(Thread.MAX_PRIORITY);
        m.start();
        w.start();
    }
}

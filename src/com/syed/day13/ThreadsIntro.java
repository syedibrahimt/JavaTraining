package com.syed.day13;

class Men extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Man is running");
        }
    }
}

class Women extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Woman is running");
        }
    }
}

public class ThreadsIntro {
    public static void main(String[] args) {
        Men m = new Men();
        Women w = new Women();
        m.start();
        w.start();
    }
}

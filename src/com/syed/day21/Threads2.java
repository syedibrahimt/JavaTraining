package com.syed.day21;

class C implements Runnable {
    public void run(){
        for (int i=0; i<5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class D implements Runnable {
    public void run(){
        for (int i=0; i<5; i++) {
            System.out.println("Bye");
            try {
                Thread.sleep(10);
            }catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

public class Threads2 {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}

package com.syed.day21;

class A extends Thread {
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

class B extends  Thread {
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

public class Threads1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}

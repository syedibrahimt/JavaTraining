package com.syed.day14;

class Counter {
    int count;
    public synchronized int increment(){
        return count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable r1 = () -> {
            for (int i = 0; i < 20000; i++) {
                counter.increment();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 20000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.count);
    }
}

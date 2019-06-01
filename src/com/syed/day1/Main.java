package com.syed.day1;

public class Main {

    public static void main(String[] args) {
        byte b = 127;
        short s = 22455;
        int i = 2_545_454;
        long l = 50000 + 10 * (b + s + i);
        System.out.println("longAnswer is " + l);
    }
}

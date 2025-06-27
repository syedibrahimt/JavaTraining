package com.syed.day12;

public class Exception {
    public static void main(String[] args) {
        int i = 0;
        try {
            System.out.println(5/i);
        } catch (java.lang.Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("TRY CATCH");
        }

    }
}

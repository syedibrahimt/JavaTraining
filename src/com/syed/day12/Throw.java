package com.syed.day12;

public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int div;
        try {
            div = 18 / 20;
            if (div == 0) throw new ArithmeticException("Div should not be 0");
        } catch (ArithmeticException e) {
            div = 1;
            System.out.println(e);
        }
        System.out.println("div : " + div);
    }
}

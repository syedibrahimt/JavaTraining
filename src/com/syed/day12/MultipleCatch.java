package com.syed.day12;

import java.lang.Exception;

public class MultipleCatch {
    public static void main(String[] args) {
        int i = 1;
        String name = null;
        try {
            System.out.println(100 / i);
            System.out.println(name.toString());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (Exception e) {
            System.out.println("Parent exception");
        }
    }
}

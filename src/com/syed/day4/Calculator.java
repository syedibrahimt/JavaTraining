package com.syed.day4;

public class Calculator {
    public int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public int sub(int a, int b){
        System.out.println(a-b);
        return a-b;
    }
    public int mul(int a, int b){
        System.out.println(a*b);
        return a* b;
    }
    public int div(int a, int b){
        System.out.println(a/b);
        return a/b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(int a, double b, int c){
        return  a+b+c;
    }
}

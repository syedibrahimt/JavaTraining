package com.syed.day9;

class A {
    public void show() {
        System.out.println("In A show");
    }
    class B {
        public void show() {
            System.out.println("In B show");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.show();
    }
}
package com.syed.stream;

public class Sample {
    public static void main(String[] args) {
        int i = 0;
        try {
            if (i == 0) {
                throw new DividedByZeroException("i value cannot be zero");
            }
            int j = 10 / i;
            System.out.println(j);
        } catch (DividedByZeroException e) {
            System.out.println("DividedByZeroException Exception " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception " + e.getMessage());
        }

    }
}

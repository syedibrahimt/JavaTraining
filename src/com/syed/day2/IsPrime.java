package com.syed.day2;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(22));
    }

    private static boolean checkPrime(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

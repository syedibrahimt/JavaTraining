package com.syed.day3;

import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter the number " + i + ": ");
//            boolean isNumberInt = scanner.hasNextInt();
//            if (isNumberInt) {
//                int number = scanner.nextInt();
//                sum += number;
//            } else {
//                System.out.println("Enter a valid number");
//            }
//            scanner.nextLine();
//        }
        int min = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter a number : ");
            boolean hasInteger = scanner.hasNextInt();
            if (hasInteger) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The min is " + min);
    }
}

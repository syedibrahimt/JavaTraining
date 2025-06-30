package com.syed.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        int num = Integer.parseInt(bf.readLine());
        System.out.println("The Number is : " + num);
        System.out.println("Enter another number : ");
        Scanner sc = new Scanner(System.in);
        int anotherNumber = sc.nextInt();
        System.out.println("The Another number is : " + anotherNumber);
    }
}

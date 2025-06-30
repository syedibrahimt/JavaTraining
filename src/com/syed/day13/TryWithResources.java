package com.syed.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

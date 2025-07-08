package com.syed.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Syed", "Ibrahim", "Hakeem", "Afrin");
        List<String> uNames = names.stream().map(String::toUpperCase).toList();
        uNames.forEach(System.out::println);
    }
}

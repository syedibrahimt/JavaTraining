package com.syed.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Syed", "Hakeem", "Afrin", "Fathima", "Ali", "Al");
        System.out.println("names : " + names);
        List<String> namesLessThan3 = names.stream().filter(name -> name.length() > 3).collect(Collectors.toList());
        System.out.println("namesLessThan3 : " + namesLessThan3);
        List<List<String>> fruits = Arrays.asList(
                Arrays.asList("Apple", "Banana", "Orange"),
                Arrays.asList("Watermelon", "Chikoo", "Pomegranete"),
                Arrays.asList("Amla", "Mosambi", "Fig")
        );
        System.out.println("fruits : " + fruits);
        List<String> allFruits = fruits.stream().flatMap(List::stream).toList();
    }
}

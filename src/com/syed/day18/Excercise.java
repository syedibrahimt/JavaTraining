package com.syed.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Excercise {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
        System.out.println("Products: " + products);
        Stream<String> productStream = products.stream();
        List<String> sortedProducts = productStream.filter(p -> p.length() > 5).map(String::toUpperCase).sorted().toList();
        System.out.println("Filtered Products: " + sortedProducts);
    }
}

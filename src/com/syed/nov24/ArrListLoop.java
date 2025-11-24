package com.syed.nov24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrListLoop {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        System.out.println("\nIterating using for loop\n*********");
        for (int i = 0; i< programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }

        System.out.println("\nIterating using enhanced for loop\n*********");
        for (String language: programmingLanguages) {
            System.out.println(language);
        }

        System.out.println("\nIterating using Iterator\n*********");
        Iterator<String> iterator = programmingLanguages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating using iterator for each remaining\n*********");
        programmingLanguages.iterator().forEachRemaining(System.out::println);

        System.out.println("\nIterating using Java 8 lambda expression\n*********");
        programmingLanguages.forEach(System.out::println);
    }
}

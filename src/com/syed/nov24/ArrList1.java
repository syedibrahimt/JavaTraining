package com.syed.nov24;

import java.util.ArrayList;
import java.util.List;

public class ArrList1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println(animals);
        animals.add(1, "Dino");
        System.out.println(animals);

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        List<Integer> l3 = new ArrayList<>(l1);
        l3.addAll(l2);
        System.out.println(l3);
    }
}

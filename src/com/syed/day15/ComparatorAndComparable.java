package com.syed.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("syed");
        names.add("hakeem");
        names.add("afrin");
        names.add("fathimafathima");
        names.add("ibrahim");
        Comparator<String> comp = (String n1, String n2) -> n1.length() > n2.length() ? 1 : -1;
        Collections.sort(names, comp);
        for (String name: names) System.out.println(name);
    }
}

package com.syed.day15;

import java.util.*;

public class SetAndMap {
    public static void main(String[] args) {
        Set<Integer> ageSet = new HashSet<>();
        ageSet.add(12);
        ageSet.add(12);
        ageSet.add(12);
        ageSet.add(12);
        ageSet.add(13);
        ageSet.add(15);
        ageSet.add(12);
        Iterator<Integer> iterator = ageSet.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        Map<String, Integer> students = new HashMap<>();
        students.put("syed", 29);
        students.put("Afrin", 25);
        students.put("Hakeem", 1);
        for(String key: students.keySet()) {
            System.out.println(key + " : "+ students.get(key));
        }
    }
}

package com.syed.day22;

import java.util.*;

public class CollectionAPI {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums.indexOf(30));
        Set<String> strSet = new TreeSet<>();
        strSet.add("syed");
        strSet.add("hakeem");
        strSet.add("afrin");
        strSet.add("ibrahim");

        Iterator<String> it = strSet.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Syed", 44);
        studentMap.put("Ibrahim", 13);
        studentMap.put("Hakeem", 55);
        System.out.println(studentMap.keySet());
    }
}

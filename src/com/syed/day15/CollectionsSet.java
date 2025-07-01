package com.syed.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSet {
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
    }
}

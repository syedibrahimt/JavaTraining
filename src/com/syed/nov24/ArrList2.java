package com.syed.nov24;

import java.util.ArrayList;
import java.util.List;

public class ArrList2 {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is Empty : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Meta");
        topCompanies.add("Microsoft");
        System.out.println("There are "+topCompanies.size() + " top companies in the world and they are "+ topCompanies);
        System.out.println("The first in the list is "+ topCompanies.get(0));
        System.out.println("The first in the list is "+ topCompanies.getFirst());
        System.out.println("The last in the list is "+ topCompanies.get(topCompanies.size() - 1));
        System.out.println("The last in the list is "+ topCompanies.getLast());
        Boolean removed = topCompanies.removeIf(element -> element.startsWith("M"));
        System.out.println(topCompanies);
        System.out.println(removed);
        topCompanies.clear();
        System.out.println(topCompanies);
    }
}

package com.syed.day22;

import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Comparator<String> cmp = (a, b) -> a.length() > b.length() ? -1 : 1;
        List<String> studentList = new ArrayList<>();
        studentList.add("Fathimaasdfghaskjdghkaj");
        studentList.add("Syed");
        studentList.add("Hakeem");
        studentList.add("Ibrahim");
        studentList.add("Rahim");
        studentList.add("Afrin");
        studentList.add("Fathima");
        System.out.println(studentList);
        Collections.sort(studentList, cmp);
        System.out.println(studentList);
    }
}

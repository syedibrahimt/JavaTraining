package com.syed.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("syed");
        names.add("hakeem");
        names.add("afrin");
        names.add("fathimafathima");
        names.add("ibrahim");
        Comparator<String> comp = (n1, n2) -> n1.length() > n2.length() ? 1 : -1;
        Collections.sort(names, comp);
        for (String name: names) System.out.println(name);

        Comparator<Student> stuComp = (s, t) -> s.age> t.age ? 1 : -1;
        List<Student> students = new ArrayList<>();
        students.add(new Student("syed", 29));
        students.add(new Student("ibrahim", 29));
        students.add(new Student("hakeem", 1));
        students.add(new Student("afrin", 25));
        System.out.println(students);
        Collections.sort(students, stuComp);
        for(Student s: students) System.out.println(s.name);
    }
}

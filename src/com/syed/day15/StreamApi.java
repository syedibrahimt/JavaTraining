package com.syed.day15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(10,92,73,46,5,64,7,83);
        Stream<Integer> s1 = ids.stream();
        Stream s2 = s1.filter(id -> id>10);
        s2.forEach(id -> System.out.println(id));
    }
}

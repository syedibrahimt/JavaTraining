package com.syed.day16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilterReduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,12,45,23,11,65454,324);
        Stream<Integer> s1 =nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .sorted();
        s1.forEach(s -> System.out.println(s));
        System.out.println(nums.stream().reduce(0, (c, e)-> c+e));
    }
}

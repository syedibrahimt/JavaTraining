package com.syed.day20;

public class Main {
     public int findSingleNumber(int[] nums){
        int singleNumber = 0;
        for (int n: nums) {
            singleNumber ^= n;
            System.out.println(singleNumber);
        }
        return singleNumber;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.findSingleNumber(new int[]{4,1,1,2,2}));
    }
}

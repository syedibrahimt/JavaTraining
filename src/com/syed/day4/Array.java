package com.syed.day4;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        System.out.println(arr[0]);

        int[][] nums = new int[3][4];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4;j++){
                nums[i][j] = j+1;
            }
        }
        for(int i = 0; i<3;i++){
            for(int j = 0; j<4;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println("\n");
        }
    }
}

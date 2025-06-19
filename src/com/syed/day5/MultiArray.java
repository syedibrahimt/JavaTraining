package com.syed.day5;

public class MultiArray {
    public static void main(String[] args) {
        System.out.println("ARRAY");
        int[] single = new int[5];
        for(int i=0; i<single.length; i++){
            single[i] = (int)(Math.random() *100);
        }
        for(int i:single){
            System.out.print(i + " ");
        }
        System.out.println("\nTWO D ARRAY");

        int[][] twoD = new int[4][4];
        for(int i = 0; i< twoD.length; i++){
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = (int) (Math.random()* 100);
            }
        }

        for(int[] ints: twoD) {
            for (int j: ints) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}

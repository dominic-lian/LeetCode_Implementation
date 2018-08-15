package com.dominic;

public class Main {

    public static void main(String[] args) {

        int[][] array = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        Solution solution = new Solution();

        solution.setZeroes(array);

        for (int[] subArray:array) {
            for (int i = 0; i < subArray.length; i++) {
                System.out.print(subArray[i] + ",");
            }
            System.out.println("");
        }

    }
}

package com.dominic;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {10,10,20,100,40,60,50,0};
        int k = 4;

        System.out.println(solution.findKthLargest(array, k));
    }
}

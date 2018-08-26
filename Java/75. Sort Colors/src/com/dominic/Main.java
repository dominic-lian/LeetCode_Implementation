package com.dominic;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums =  {2,0,2,1,1,0};

        solution.sortColors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

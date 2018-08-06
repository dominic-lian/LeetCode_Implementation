package com.dominic;

class Solution {
    public int missingNumber(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return (int) (nums.length * (nums.length + 1) / 2 - sum);
    }
}

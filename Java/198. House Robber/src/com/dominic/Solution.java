package com.dominic;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {

            int[] sum = new int[nums.length];
            sum[0] = nums[0];
            sum[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                sum[i] = Math.max(sum[i-2] + nums[i], sum[i - 1]);
            }

            return sum[nums.length - 1];
        }
    }
}

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
            return Math.max(rob(nums, 0,nums.length-2), rob(nums, 1,nums.length-1));
        }
    }

    public static int rob(int[] nums, int start, int end) {
        int length = end - start + 1;
        int[] sum = new int[length];
        sum[0] = nums[start];
        sum[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < length; i++) {
            sum[i] = Math.max(sum[i-2] + nums[start + i], sum[i - 1]);
        }

        return sum[sum.length - 1];
    }
}

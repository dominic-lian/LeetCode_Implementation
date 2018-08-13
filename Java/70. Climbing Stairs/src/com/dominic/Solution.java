package com.dominic;

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int[] nums = new int[n+1];
        nums[1] = 1;
        nums[2] = 2;

        climb(nums, n);

        return nums[n];
    }

    public static void climb(int[] nums, int n) {
        int x = n - 1;
        int y = n - 2;

        if (x >= 2 && nums[x] == 0) {
            climb(nums, x);
        }

        if (y >= 2 && nums[y] == 0) {
            climb(nums, y);
        }

        nums[n] = nums[x] + nums[y];
    }
}

package com.dominic;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];
        int min = nums[0];
        for (int i : nums) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        int[] array = new int[max - min + 1];
        for (int i : nums) {
            array[max - i]++;
        }

        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number += array[i];
            if (number >= k) {
                return max - i;
            }
        }
        return 0;
    }
}

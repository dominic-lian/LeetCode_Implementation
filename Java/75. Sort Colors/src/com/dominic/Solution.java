package com.dominic;

class Solution {
    public void sortColors(int[] nums) {
        int zero = -1;
        int i = 0;
        int two = nums.length;

        while(i < two) {
            if (nums[i] == 1) {
                i += 1;
            } else if (nums[i] == 2) {
                two -= 1;
                int k = nums[two];
                nums[two] = nums[i];
                nums[i] = k;
            } else {
                zero += 1;
                int k = nums[zero];
                nums[zero] = nums[i];
                nums[i] = k;
                i += 1;
            }
        }
    }
}
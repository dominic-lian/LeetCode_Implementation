package com.dominic;

import java.lang.reflect.Array;
import java.util.Random;

class Solution {
    private static int[] privateNums;
    private static int[] randomNums;

    public Solution(int[] nums) {
        privateNums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return privateNums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        randomNums = privateNums.clone();
        for (int i = 0; i < randomNums.length; i++) {
            int t = random.nextInt(i + 1);
            int temp = randomNums[i];
            randomNums[i] = randomNums[t];
            randomNums[t] = temp;
        }

        return randomNums;
    }
}
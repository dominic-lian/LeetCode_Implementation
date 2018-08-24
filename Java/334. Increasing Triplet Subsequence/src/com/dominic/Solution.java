package com.dominic;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE;
        for (int i: nums) {
            if (m1 >= i) {
                m1 = i;
            } else if (m2 >= i) {
                m2 = i;
            } else {
                return true;
            }
        }

        return false;
    }
}
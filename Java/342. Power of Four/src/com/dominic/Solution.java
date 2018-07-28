package com.dominic;

class Solution {
    public boolean isPowerOfFour(int num) {
        if (isPowerOfTwo(num) && ((num & 0x55555555) != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

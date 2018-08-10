package com.dominic;

public class Solution {
    public int hammingDistance(int x, int y) {
        return hammingWeight(x^y);
    }

    public int hammingWeight(int n) {

        int count = 0;

        while(n != 0) {
            n = n & (n - 1);
            count += 1;
        }

        return count;
    }
}

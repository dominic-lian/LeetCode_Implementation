package com.dominic;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int min = 1, max = n, mid = 0;
        while (min <= max) {
            mid = min + (max - min) / 2;
            if (super.isBadVersion(mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
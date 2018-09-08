package com.dominic;

class Solution {
    public boolean isMonotonic(int[] A) {

        int isUp = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                if (isUp == 0) {
                    isUp = 1;
                } else if (isUp == -1) {
                    return false;
                }
            } else if (A[i] < A[i + 1]) {
                if (isUp == 0) {
                    isUp = -1;
                } else if (isUp == 1) {
                    return false;
                }
            }
        }

        return true;
    }
}

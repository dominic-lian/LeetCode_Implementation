package com.dominic;

class Solution {
    public int trailingZeroes(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n / 5;
            n = n / 5;
        }

        return answer;
    }
}

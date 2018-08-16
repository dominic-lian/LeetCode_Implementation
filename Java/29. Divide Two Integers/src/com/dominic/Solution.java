package com.dominic;

//https://blog.csdn.net/Windows_Defender/article/details/80445969

class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        } else if (divisor == 1) {
            return  dividend;
        }

        long m = Math.abs((long)dividend);
        long n = Math.abs((long)divisor);
        long answer = 0;

        int sign = ((dividend < 0) == (divisor < 0)) ? 1 : -1;

        while (m >= n) {
            long t = n, p = 1;
            while (m >= (t << 1)) {
                p <<= 1;
                t <<= 1;
            }

            answer += p;
            m -= t;
        }

        return (int) answer * sign;
    }
}
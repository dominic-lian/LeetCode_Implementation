package com.dominic;

//https://blog.csdn.net/qq_17550379/article/details/80875782

class Solution {
    public int numSquares(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }

        if (n % 8 == 7) {
            return 4;
        }

        int a = 0;

        while (Math.pow(a, 2) <= n) {
            int b = (int)Math.sqrt((n - Math.pow(a, 2)));

            if (Math.pow(a, 2) + Math.pow(b,2) == n) {
                if (a > 0 && b > 0) {
                    return 2;
                } else {
                    return 1;
                }

            }

            a += 1;
        }

        return 3;
    }
}

package com.dominic;

import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                for (int j = i*2; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (primes[i])
                count += 1;
        }

        return count;
    }
}

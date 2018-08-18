package com.dominic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isHappy(int n) {
        int number = n;
        int sum = 0;
        List<Integer> priviousNumbers = new ArrayList<Integer>();
        priviousNumbers.add(number);

        while (sum != 1 || number != 0) {
            int onesNumber = number % 10;
            number = number / 10;
            sum = (int) Math.pow(onesNumber, 2) + sum;

            if (number == 0 && sum == 1) {
                return true;
            } else if (number == 0 && sum != 1) {
                for (int i = 0; i < priviousNumbers.size(); i++) {
                    if (sum == priviousNumbers.get(i)) {
                        return false;
                    }
                }

                priviousNumbers.add(sum);
                number = sum;
                sum = 0;
            }
        }

        return false;
    }
}
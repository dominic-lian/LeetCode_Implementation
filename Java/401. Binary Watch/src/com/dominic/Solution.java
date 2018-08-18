package com.dominic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<String>();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i)+Integer.bitCount(j) == num) {
                    String timeString = String.format("%d:%02d", i, j);
                    times.add(timeString);
                }

            }
        }

        return times;

    }
}
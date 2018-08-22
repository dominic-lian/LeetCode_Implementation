package com.dominic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        boolean isNegative = (numerator < 0) ^ (denominator < 0);
        double numeratorDouble = Math.abs((long) numerator);
        double denominatorDouble = Math.abs((long) denominator);
        double integer = Math.floor(numeratorDouble / denominatorDouble);
        numeratorDouble -= denominatorDouble * integer;

        int length = 0;
        String cache = new String();
        List<Double> dividendCache = new ArrayList<Double>();
        boolean isRecurring = false;
        int recurringStart = 0;
        int i = 0;

        while (numeratorDouble != 0) {
            numeratorDouble *= 10;
            length = dividendCache.size();
            for (i = 0; i < length; i++) {
                if (dividendCache.get(i) == numeratorDouble) {
                    isRecurring = true;
                    recurringStart = i;
                    break;
                }
            }

            if (isRecurring) {
                break;
            }

            i = (int) Math.floor(numeratorDouble / denominatorDouble);
            cache += i;

            dividendCache.add(numeratorDouble);
            numeratorDouble -= denominatorDouble * i;
        }

        String ret = isNegative ? (numerator != 0 ? "-" : "") : "";

        if (integer == 0) {
            ret += '0';
        } else {
            String temp = "";
            while (integer != 0) {
                int c = (int) (integer - 10 * Math.floor(integer / 10));
                temp = c + temp;
                integer = Math.floor(integer / 10);
            }

            ret += temp;
        }

        if (dividendCache.size() > 0) {
            ret += '.';
            i = 0;
        }

        if (isRecurring) {
            ret += cache.substring(0, recurringStart);
            ret += '(';
            ret += cache.substring(recurringStart);
            ret += ')';
        } else {
            ret += cache;
        }

        return ret;
    }
}

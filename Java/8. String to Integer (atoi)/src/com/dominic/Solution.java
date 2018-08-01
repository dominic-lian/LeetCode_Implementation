package com.dominic;

class Solution {
    public int myAtoi(String str) {
        char[] charArray = str.toCharArray();

        long answer = 0;
        int sign = 1;
        boolean isFirst = true;

        for (int i = 0; i < charArray.length; i++) {

            if (isFirst) {

                if (charArray[i] == ' ') {
                    continue;
                }

                isFirst = false;

                if (charArray[i] == '-') {
                    sign = -1;
                } else if (charArray[i] == '+') {
                    sign = 1;
                } else if (charArray[i] >= '0' && charArray[i] <= '9') {
                    answer += charArray[i] - '0';
                } else {
                    return 0;
                }
            } else {
                if (charArray[i] >= '0' && charArray[i] <= '9') {
                    answer *= 10;
                    answer += charArray[i] - '0';

                    if (sign == 1 && answer > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else if (sign == -1 && answer * sign < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    return (int) (answer *= sign);
                }
            }
        }

        return (int) (answer *= sign);
    }

}

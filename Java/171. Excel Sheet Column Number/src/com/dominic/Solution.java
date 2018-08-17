package com.dominic;

class Solution {
    public int titleToNumber(String s) {

        int number = 0;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char oneTitle = charArray[charArray.length - i - 1];

            number += (oneTitle - 'A' + 1) * Math.pow(26, i);
        }

        return number;
    }
}

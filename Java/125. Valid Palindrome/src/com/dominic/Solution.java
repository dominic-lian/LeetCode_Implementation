package com.dominic;

class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        while (i <= j) {
            if (!isLetterOrNumber(charArray[i])) {
                i += 1;
            } else if (!isLetterOrNumber(charArray[j])) {
                j -= 1;
            } else if ((charArray[i] - 'a' + 32) % 32 != (charArray[j] - 'a' + 32) % 32) {
                return false;
            } else {
                i += 1;
                j -= 1;
            }
        }

        return true;
    }

    boolean isLetterOrNumber(char character) {
        if ((character >= 'a' && character <= 'z') ||
                (character >= 'A' && character <= 'Z') ||
                (character >= '0' && character <= '9')) {
            return true;
        } else {
            return false;
        }
    }
}
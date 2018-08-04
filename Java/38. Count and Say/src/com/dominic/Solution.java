package com.dominic;

class Solution {
    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        } else {
            n -= 1;
        }

        String string_1 = "1";
        String string_2 = "";

        char[] string_1_array = string_1.toCharArray();

        while (n > 0) {
            for (int i = 0; i < string_1.length(); i++) {
                for (int j = 0; ; j++) {
                    if (i + j + 1 < string_1.length() && (string_1_array[i + j] == string_1_array[i + j + 1])) {
                        continue;
                    }

                    j += 1;
                    string_2 = string_2 + j + string_1_array[i];

                    i = i + j - 1;

                    break;
                }
            }

            string_1 = string_2;
            string_2 = "";
            string_1_array = string_1.toCharArray();

            n -= 1;
        }

        return  string_1;
    }
}

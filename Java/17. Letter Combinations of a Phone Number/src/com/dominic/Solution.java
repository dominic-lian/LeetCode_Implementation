package com.dominic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if (digits.length() == 0) {
            return list;
        }

        String[] strings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        backtracing(strings, "", digits, 0, list);

        return list;
    }

    public static void backtracing(String[] strings, String s, String digits, int flag, List<String> list) {
        if (flag >= digits.length()) {
            list.add(s);
            return;
        }

        String chars = strings[digits.charAt(flag) - '0'];

        for (int i = 0; i < chars.length(); i++) {
            backtracing(strings, s + chars.charAt(i), digits, flag + 1, list);
        }
    }
}

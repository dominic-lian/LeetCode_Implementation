package com.dominic;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            if (map.containsKey(sArray[i])) {
                map.put(sArray[i], map.get(sArray[i]) + 1);
            } else {
                map.put(sArray[i], 1);
            }
        }

        for (int j = 0; j < tArray.length; j++) {
            if (map.containsKey(tArray[j])) {
                map.put(tArray[j], map.get(tArray[j]) - 1);
            } else {
                map.put(tArray[j], -1);
            }
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
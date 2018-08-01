package com.dominic;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (!map.containsKey(charArray[i])) {
                map.put(charArray[i], i);
            } else {
                map.put(charArray[i], -1);
            }
        }


        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() != -1) {
                return entry.getValue();
            }
        }

        return -1;
    }
}

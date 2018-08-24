package com.dominic;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String keyStr = String.valueOf(charArray);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}

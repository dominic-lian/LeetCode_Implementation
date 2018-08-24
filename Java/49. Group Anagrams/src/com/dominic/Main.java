package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> answer = solution.groupAnagrams(array);

        for (int i = 0; i < answer.size(); i++) {
            List<String> subAnswer = answer.get(i);
            for (int j = 0; j < subAnswer.size(); j++) {
                System.out.print(subAnswer.get(j) + " ");
            }
            System.out.println("");
        }
    }
}

package com.dominic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> outterList = new ArrayList<List<Integer>>();

        for (int i = 1; i <= numRows; i++) {

            List<Integer> innerList = new ArrayList<Integer>();

            for (int j = 1; j <= i; j++) {

                if (i == 1 || j == 1 || (i != 1 && j == i)) {
                    innerList.add(1);
                } else {
                    innerList.add(outterList.get(i - 2).get(j - 2) + outterList.get(i - 2).get(j - 1));
                }
            }

            outterList.add(innerList);
        }

        return outterList;
    }
}

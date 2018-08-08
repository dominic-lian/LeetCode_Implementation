package com.dominic;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> formerList = new ArrayList<Integer>();

        for (int i = 0; i <= rowIndex; i++) {

            List<Integer> innerList = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {

                if (i == 0 || j == 0 || (i != 0 && j == i)) {
                    innerList.add(1);
                } else {
                    innerList.add(formerList.get(j - 1) + formerList.get(j));
                }
            }

            formerList = innerList;
        }

        return formerList;
    }
}

package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        for (Integer integer : solution.getRow(3)) {
            System.out.print(integer);
        }
    }
}

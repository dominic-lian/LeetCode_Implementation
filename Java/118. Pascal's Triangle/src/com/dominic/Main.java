package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        for (List<Integer> list: solution.generate(5)) {
            for (Integer integer: list) {
                System.out.print(integer);
            }
            System.out.println("");
        }
    }
}

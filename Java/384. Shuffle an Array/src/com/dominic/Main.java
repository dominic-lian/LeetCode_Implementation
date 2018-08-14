package com.dominic;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        Solution solution = new Solution(numbers);

        System.out.println(solution.shuffle());
        System.out.println(solution.reset());
    }
}

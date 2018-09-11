package com.dominic;

class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j] * 6;
                if (grid[i][j] > 1) {
                    sum -= (grid[i][j] - 1) * 2;
                }

                if (i > 0) {
                    sum -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                }

                if (j > 0) {
                    sum -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
                }
            }
        }

        return sum;
    }
}
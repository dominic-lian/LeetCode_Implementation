package com.dominic;

class Solution {
    int lenM;
    int lenN;

    public int numIslands(char[][] grid) {
        int count = 0;

        lenM = grid.length;
        if (lenM == 0) {
            return 0;
        }
        lenN = grid[0].length;

        for (int i = 0; i < lenM; i++) {
            for (int j = 0; j < lenN; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    DFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void DFS(char[][] grid, int i, int j) {
        if (i >= lenM || i < 0 || j >= lenN || j < 0 || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);

    }
}

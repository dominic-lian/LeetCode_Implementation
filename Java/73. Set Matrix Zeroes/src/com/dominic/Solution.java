package com.dominic;

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isFirstRowContainsZero = false;

        for (int number:matrix[0]) {
            if (number == 0) {
                isFirstRowContainsZero = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            boolean thisRowContainsZero = false;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    thisRowContainsZero = true;
                }
            }

            if (thisRowContainsZero) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (isFirstRowContainsZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
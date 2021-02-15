package ru.job4j.array;

public class Transposition {

    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int index1 = 0; index1 < matrix.length; index1++) {
            for (int index2 = 0; index2 < matrix[0].length; index2++) {
                result[index2][index1] = matrix[index1][index2];
            }
        }
        return result;
    }
}

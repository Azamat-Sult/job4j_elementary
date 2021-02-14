package ru.job4j.array;

public class TriangleMatrix {

    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int num = 1;
        for (int row = 0; row < count; row++) {
            triangle[row] = new int[row + 1];
            for (int cell = 0; cell <= row; cell++) {
                triangle[row][cell] = num;
                num++;
            }
        }
        return triangle;
    }
}

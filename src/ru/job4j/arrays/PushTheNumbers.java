package ru.job4j.arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        for (int index1 = 0; index1 < row; index1++) {
            array[index1][column] = array[index1 + 1][column];
        }
        for (int index1 = array.length - 1; index1 > row; index1--) {
            array[index1][column] = array[index1 - 1][column];
        }
        for (int index1 = 0; index1 < column; index1++) {
            array[row][index1] = array[row][index1 + 1];
        }
        for (int index1 = array.length - 1; index1 > column; index1--) {
            array[row][index1] = array[row][index1 - 1];
        }
        array[row][column] = 0;
    }
}

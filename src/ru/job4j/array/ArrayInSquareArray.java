package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int dimension = (int) Math.round(Math.sqrt(array.length));
        int[][] rsl = new int[dimension][dimension];
        int count = 0;
        for (int index1 = 0; index1 < rsl.length; index1++) {
            for (int index2 = 0; index2 < rsl[0].length; index2++) {
                if (count < array.length) {
                    rsl[index1][index2] = array[count];
                    count++;
                } else {
                    rsl[index1][index2] = 0;
                }
            }
        }
        return rsl;
    }
}

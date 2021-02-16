package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left[0].length];
        int count = 0;
        for (int index1 = 0; index1 < left.length; index1++) {
            for (int index2 = 0; index2 < left[0].length; index2++) {
                rsl[count] = Math.max(left[index1][index2], right[index1][index2]);
                count++;
            }
        }
        return rsl;
    }
}

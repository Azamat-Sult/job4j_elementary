package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int index1 = 0;
        int index2 = 0;
        int[] rsl = new int[left.length + right.length];
        while (index1 < left.length && index2 < right.length) {
            if (left[index1] <= right[index2]) {
                rsl[index1 + index2] = left[index1];
                index1++;
            } else {
                rsl[index1 + index2] = right[index2];
                index2++;
            }
        }
        while (index1 < left.length) {
            rsl[index1 + index2] = left[index1];
            index1++;
        }
        while (index2 < right.length) {
            rsl[index1 + index2] = right[index2];
            index2++;
        }
        return rsl;
    }
}

package ru.job4j.array;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[2 + middle.length / 2 + right.length / 2];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];
        for (int index1 = 1; index1 < rsl.length - 1; index1++) {
            if (index1 % 2 != 0) {
                rsl[index1] = right[index1 - 1];
            }
            if (index1 % 2 == 0) {
                rsl[index1] = middle[index1 - 1];
            }
        }
        return rsl;
    }
}

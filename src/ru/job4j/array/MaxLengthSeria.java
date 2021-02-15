package ru.job4j.array;

public class MaxLengthSeria {

    public static int find(int[] array) {
        int count = 1;
        int rsl = 1;
        for (int index1 = 0; index1 < array.length - 1; index1++) {
            if (array[index1] <= array[index1 + 1]) {
                count++;
            } else if (count > rsl) {
                rsl = count;
                count = 1;
            }
        }
        return Math.max(count, rsl);
    }
}

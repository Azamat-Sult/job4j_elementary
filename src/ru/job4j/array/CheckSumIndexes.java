package ru.job4j.array;

public class CheckSumIndexes {

    public static int[] collectNewArray(int[][] data, int sum) {
        int[] temp = new int[data.length * data[0].length];
        int count = 0;
        int zeroCount = 0;
        for (int index1 = 0; index1 < data.length; index1++) {
            for (int index2 = 0; index2 < data[index1].length; index2++) {
                if (index1 + index2 == sum) {
                    temp[count] = 0;
                    zeroCount++;
                } else {
                    temp[count] = data[index1][index2];
                }
                count++;
            }
        }
        int[] rsl = new int[temp.length - zeroCount];
        count = 0;
        for (int i : temp) {
            if (i != 0) {
                rsl[count] = i;
                count++;
            }
        }
        return rsl;
    }
}

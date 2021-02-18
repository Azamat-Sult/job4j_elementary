package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {

    public static int[][] found(int[] data, int up, int down) {
        int[] temp1 = new int[data.length];
        for (int index1 = 0; index1 < data.length; index1++) {
            if (data[index1] >= up || data[index1] <= down) {
                temp1[index1] = index1;
            }
        }
        int[][] result = new int[data.length][2];
        int[] temp2 = new int[2];
        int count = 0;
        for (int index1 = 0; index1 < temp1.length; index1++) {
            if (temp1[index1] != 0) {
                temp2[0] = index1;
                for (int index2 = index1; index2 < temp1.length; index2++) {
                    if (temp1[index2] == 0) {
                        temp2[1] = index2 - 1;
                        index1 = index2;
                        result[count][0] = temp2[0];
                        result[count][1] = temp2[1];
                        count++;
                        break;
                    }
                    if (index2 == temp1.length - 1) {
                        temp2[1] = index2;
                        index1 = index2;
                        result[count][0] = temp2[0];
                        result[count][1] = temp2[1];
                        count++;
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(result, count);
    }
}

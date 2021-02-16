package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int dimension = 0;
        for (int[] ints : array) {
            dimension += ints.length;
        }
        int[] temp = new int[dimension];
        int count = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                temp[count] = anInt;
                count++;
            }
        }

        dimension = (int) Math.ceil(Math.sqrt(temp.length));
        int[][] rsl = new int[dimension][dimension];
        count = 0;
        for (int index1 = 0; index1 < rsl.length; index1++) {
            for (int index2 = 0; index2 < rsl[0].length; index2++) {
                if (count < temp.length) {
                    rsl[index1][index2] = temp[count];
                    count++;
                } else {
                    rsl[index1][index2] = 0;
                }
            }
        }
        return rsl;
    }
}

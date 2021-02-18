package ru.job4j.array;

public class SubtractMinMax {

    public static int calculate(int[] ints) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int anInt : ints) {
            if (anInt < min) {
                min = anInt;
            }
            if (anInt > max) {
                max = anInt;
            }
        }
        return max - min;
    }
}

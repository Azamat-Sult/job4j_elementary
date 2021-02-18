package ru.job4j.array;

public class Divider {

    public static boolean check(int num, int[] ints) {
        boolean allDividers = true;
        for (int anInt : ints) {
            if (num % anInt != 0) {
                allDividers = false;
                break;
            }
        }
        return allDividers;
    }
}

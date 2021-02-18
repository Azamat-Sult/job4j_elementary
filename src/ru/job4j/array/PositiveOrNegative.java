package ru.job4j.array;

public class PositiveOrNegative {

    public static boolean check(int[] data) {
        int countNegative = 0;
        int countPositive = 0;
        for (int datum : data) {
            if (datum < 0) {
                countNegative++;
            }
            if (datum > 0) {
                countPositive++;
            }
        }
        boolean result = false;
        if (countNegative % 2 != 0) {
            result = true;
        }
        if (countPositive % 2 == 0) {
            result = false;
        }
        return result;
    }
}

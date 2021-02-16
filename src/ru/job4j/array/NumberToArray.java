package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String size = Integer.toString(number);
        int[] numb = new int[size.length()];
        int count = 0;
        while (number >= 1) {
            numb[count] = number - (number / 10) * 10;
            number /= 10;
            count++;
        }
        return numb;
    }
}

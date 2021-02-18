package ru.job4j.array;

public class Decoding {

    public static int[] decode(int[] ints, int number) {
        int[] temp = new int[ints.length];
        for (int index = 0; index < ints.length; index++) {
            temp[index] = ints[index] % number;
        }
        return temp;
    }
}

package ru.job4j.array;

public class Split {

    public static char[][] split(char[] str, char c) {

        int count1 = 0;
        for (char value : str) {
            if (value == c) {
                count1++;
            }
        }
        char[][] result = new char[count1 + 1][];
        count1 = 0;
        int count2 = 0;

        for (int index1 = 0; index1 < str.length; index1++) {
            if (str[index1] != c) {
                count2++;
            }
            if (str[index1] == c || index1 == str.length - 1) {
                result[count1] = new char[count2];
                count1++;
                count2 = 0;
            }
        }
        count1 = 0;
        count2 = 0;
        for (char value : str) {
            if (value != c) {
                result[count1][count2] += value;
                count2++;
            }
            if (value == c) {
                count1++;
                count2 = 0;
            }
        }
        return result;
    }
}

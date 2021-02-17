package ru.job4j.array;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int count = 0;
        boolean elementIn;
        int[] temp = new int[left.length + right.length];
        for (int i : left) {
            elementIn = false;
            for (int j : right) {
                if (i == j) {
                    elementIn = true;
                    break;
                }
            }
            if (!elementIn) {
                temp[count] = i;
                count++;
            }
        }
        for (int i : right) {
            elementIn = false;
            for (int j : left) {
                if (i == j) {
                    elementIn = true;
                    break;
                }
            }
            if (!elementIn) {
                temp[count] = i;
                count++;
            }
        }
        int[] rsl = new int[count];
        System.arraycopy(temp, 0, rsl, 0, count);
        return rsl;
    }
}

package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                for (int index2 = index + 1; index2 < array.length; index2++) {
                    if (array[index2] != null) {
                        String temp = array[index];
                        array[index] = array[index2];
                        array[index2] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

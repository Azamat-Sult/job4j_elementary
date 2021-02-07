package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result = max(2, 1);
        System.out.println("Max of 2 and 1: " + result);
        result = max(3, 6);
        System.out.println("Max of 3 and 6: " + result);
        result = max(10, 10);
        System.out.println("Max of 10 and 10: " + result);
    }
}

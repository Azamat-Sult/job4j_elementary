package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("4 is Even? " + isEven(4));
        System.out.println("7 is Even? " + isEven(7));
        System.out.println("7 is Positive? " + isPositive(7));
        System.out.println("-15 is Positive? " + isPositive(-15));
        System.out.println("4 is not Even? " + notEven(4));
        System.out.println("7 is not Even? " + notEven(7));
        System.out.println("7 is not Positive? " + notPositive(7));
        System.out.println("-15 is not Positive? " + notPositive(-15));
        System.out.println("7 is not Even And Positive? " + notEvenAndPositive(7));
        System.out.println("6 is not Even And Positive? " + notEvenAndPositive(6));
        System.out.println("-9 is not Even And Positive? " + notEvenAndPositive(-9));
        System.out.println("-14 is not Even And Positive? " + notEvenAndPositive(-14));
        System.out.println("-8 even Or Not Positive? " + evenOrNotPositive(-8));
        System.out.println("-3 even Or Not Positive? " + evenOrNotPositive(-3));
        System.out.println("10 even Or Not Positive? " + evenOrNotPositive(10));
        System.out.println("13 even Or Not Positive? " + evenOrNotPositive(13));
    }
}

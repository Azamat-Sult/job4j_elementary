package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 6, 20, -5);
        double result3 = Point.distance(200, -26, -200, 50);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (2, 6) to (20, -5) " + result2);
        System.out.println("result (200, -26) to (-200, 50) " + result3);
    }

}

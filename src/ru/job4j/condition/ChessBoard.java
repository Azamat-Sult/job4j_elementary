package ru.job4j.condition;

import static java.lang.Math.abs;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        return (abs(x2 - x1) == abs(y2 - y1)) ? abs(x2 - x1) : 0;
    }
}

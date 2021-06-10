package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(6, 7, 1, 2));
        System.out.println(way(7, 0, 0, 7));
        System.out.println(way(2, 6, 4, 1));
        System.out.println(way(-1, 6, 4, 1));
        System.out.println(way(2, -1, 4, 1));
        System.out.println(way(2, 6, -1, 1));
        System.out.println(way(2, 6, 4, -1));
        System.out.println(way(10, 6, 4, 1));
        System.out.println(way(2, 10, 4, 1));
        System.out.println(way(2, 6, 10, 1));
        System.out.println(way(2, 6, 4, 10));
    }
}

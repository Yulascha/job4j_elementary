package ru.job4j;

public class SqArea {
    public static double height(int p, double k, double h, double l) {
        return p / (2 * (k + 1));
    }
    public static double length(double k, double h) {
        return h * k;
    }
    public static double square(double l, double h) {
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.height(6, 2, 1, 2);
        System.out.println(" p = 6, k = 2, h = " + result1);
        double result2 = SqArea.length(2,1);
        System.out.println(" p = 6, k = 2, l = " + result2);
        double result3 = SqArea.square(2,1);
        System.out.println(" p = 6, k = 2, s = " + result3);
    }
}

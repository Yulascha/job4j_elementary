package ru.job4j;

public class SqArea {
    public static double square(int p, double k) {
        return p / (2 * (k + 1));
        return p / (2 * (k + 1)) * k;
        return p / (2 * (k + 1)) * k * p / (2 * (k + 1));
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2,);
        System.out.println(" p = 6, k = 2, h = " + result1);
        double result2 = SqArea.square(2,1);
        System.out.println(" p = 6, k = 2, l = " + result2);
        double result3 = SqArea.square(2,1);
        System.out.println(" p = 6, k = 2, s = " + result3);
    }
}

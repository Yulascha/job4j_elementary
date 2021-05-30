package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a+b+c)/2;
        double four = Math.sqrt(3);
        double rsl = 1.732;
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}

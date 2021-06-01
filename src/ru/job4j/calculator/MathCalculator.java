package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndMultiply1(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + min(first, second) + div(first, second);
    }

    public static double minAnddiv(double first, double second) {
        return min(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiply1(10, 20));
        System.out.println("Результат расчета равен: " + minAnddiv(10, 20));
    }
}
